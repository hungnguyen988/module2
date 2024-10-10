package hoa_don_tien_dien.view;

import hoa_don_tien_dien.controller.BillController;
import hoa_don_tien_dien.model.Bill;
import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.model.DomesticCustomers;
import hoa_don_tien_dien.repository.BillRepository;
import hoa_don_tien_dien.repository.DomesticCustomersRepository;
import hoa_don_tien_dien.repository.ForeignCustomersRepository;
import hoa_don_tien_dien.validate.FindNotBillIIdException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BillView {
    private final DomesticCustomersRepository domesticCustomersRepository = new DomesticCustomersRepository();
    private final ForeignCustomersRepository foreignCustomersRepository = new ForeignCustomersRepository();
    private final BillRepository billRepository = new BillRepository();
    private final BillController billController = new BillController();
    Scanner scanner = new Scanner(System.in);
    private final CustomerView customerView = new CustomerView();


    public void displayMenuBill() {
        while (true) {
            System.out.println("-----------------Các thao tác với hóa đơn tiền điện------------------");
            System.out.println("1. Thêm hóa đơn tiền điện");
            System.out.println("2. Hiển thị danh sách hóa đơn tiền điện");
            System.out.println("3. Sửa thông tin hóa đơn tiền điện");
            System.out.println("4. Xóa hóa đơn tiền điện");
            System.out.println("0. Thoát");
            System.out.println("Chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addBill();
                    break;
                case 2:
                    displayBillList();
                    break;
                case 3:
                    updateBill();
                    break;
                case 4:
                    deleteBill();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Chọn sai. Vui lòng chọn lại.");
            }
        }

    }

    public void addBill() {
        System.out.println("---------Thêm hóa đơn tiện điện---------");
        customerView.displayAllCustomers();
        String idBill = "MHD-" + (billRepository.getAllBills().size() + 1);
        String idCustomer = getIdCustomer();
        String date = getDate();
        System.out.println("nhập số lượng điện:");
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = getPrice(idCustomer);
        double totalPrice = getTotalPrice(idCustomer, quantity, price);
        billController.addBill(new Bill(idBill, idCustomer, date, quantity, price, totalPrice));
        sortBill();
    }

    private String getIdCustomer() {
        String idCustomer;
        boolean checkCustomer = false;
        List<Customer> customers = new ArrayList<>();
        customers.addAll(domesticCustomersRepository.displayCustomers());
        customers.addAll(foreignCustomersRepository.displayCustomers());
        do {
            System.out.println("Chọn mã khách hàng:");
            idCustomer = scanner.nextLine();
            for (Customer customer : customers) {
                if (customer.getIdCustomer().equals(idCustomer)) {
                    checkCustomer = true;
                    break;
                }
            }
        } while (!checkCustomer);
        return idCustomer;
    }

    private double getPrice(String idCustomer) {
        double price = 0;
        List<Customer> customers = domesticCustomersRepository.displayCustomers();
        for (Customer customer : customers) {
            if (customer.getIdCustomer().equals(idCustomer)) {
                DomesticCustomers domesticCustomers = (DomesticCustomers) customer;
                price = switch (domesticCustomers.getCustomerType()) {
                    case "Sinh hoạt" -> 2.0;
                    case "Kinh doanh" -> 2.5;
                    case "Sản xuất" -> 3.0;
                    default -> price;
                };
            }
        }
        if (price == 0) {
            price = 2.5;
        }
        return price;
    }

    private String getDate() {
        String date = "";
        while (date.isEmpty()) {
            System.out.println("nhập ngày lập hóa đơn:");

            String inputDate = scanner.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
                Date dateObject = dateFormat.parse(inputDate);
                Date currentDate = new Date();
                if (dateObject.after(currentDate)) {
                    System.out.println("Ngày không được lớn hơn thời điểm hiện tại. Vui lòng nhập lại.");
                } else {
                    date = dateFormat.format(dateObject);
                }
            } catch (ParseException e) {
                System.out.println("Ngày nhập không hợp lệ. Vui lòng nhập theo định dạng dd/MM/yyyy.");
            }
        }
        return date;
    }

    private double getTotalPrice(String idCustomer, double quantity, double price) {
        Customer customerAdd = domesticCustomersRepository.getCustomerById(idCustomer);
        double totalPrice = 0;
        if (customerAdd != null) {
            DomesticCustomers domesticCustomer = (DomesticCustomers) customerAdd;
            double norm = domesticCustomer.getConsumptioNorms();
            if (norm < quantity) {
                totalPrice = price * norm + (quantity - norm) * price * 2.5;
            } else {
                totalPrice = quantity * price;
            }
        }
        return totalPrice;
    }

    public void displayBillList() {
        sortBill();
        billController.displayBillList();
    }

    public void updateBill() {
        displayBillList();
        System.out.println("Nhập mã hóa đơn cần sửa:");
        String idBill = scanner.nextLine();
        List<Bill> billList = billRepository.getAllBills();
        Bill bill = billList.stream().filter(b -> b.getIdBill().equals(idBill)).findFirst().orElse(null);
        billList.remove(bill);
        if (bill == null) {
            System.out.println("hóa đơn không tồn tại, vui lòng thử lại");
        } else {
            try {
                System.out.println("chọn hạng mục chỉnh sửa:");
                System.out.println("1. Sửa mã khách hàng");
                System.out.println("2. Sửa ngày lập hóa đơn");
                System.out.println("3. Sửa số lượng điện");
                System.out.println("4. Sửa đơn giá điện");
                System.out.print("Chọn:");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        updateIdCustomer(bill, billList);
                        break;
                    case 2:
                        updateDate(bill, billList);
                        break;
                    case 3:
                        updateQuantity(bill, billList);
                        break;
                    case 4:
                        updatePrice(bill, billList);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng số");
            }
        }
    }

    private void updatePrice(Bill bill, List<Bill> billList) {
        try {
            System.out.println("nhập đơn giá điện mới:");
            double newPrice = Double.parseDouble(scanner.nextLine());
            bill.setPricePerUnit(newPrice);
            bill.setTotalPrice(getTotalPrice(bill.getIdCustomer(), bill.getQuantity(), newPrice));
            billList.add(bill);
            billRepository.writeBill(billList);
            System.out.println("sửa đơn giá thành công");
        } catch (NumberFormatException e) {
            System.out.println("nhập sai định dạng số");
        }

    }

    private void updateQuantity(Bill bill, List<Bill> billList) {
        try {
            System.out.println("nhập số lượng điện mới:");
            double newQuantity = Double.parseDouble(scanner.nextLine());
            bill.setQuantity(newQuantity);
            bill.setTotalPrice(getTotalPrice(bill.getIdCustomer(), newQuantity, bill.getPricePerUnit()));
            billList.add(bill);
            billRepository.writeBill(billList);
            System.out.println("sửa số lượng điện thành công");
        } catch (NumberFormatException e) {
            System.out.println("nhập sai định dạng số");
        }

    }

    private void updateDate(Bill bill, List<Bill> billList) {
        String newDate = getDate();
        bill.setDate(newDate);
        billList.add(bill);
        billRepository.writeBill(billList);
        System.out.println("sửa ngày lập hóa đơn thành công");
    }

    private void updateIdCustomer(Bill bill, List<Bill> billList) {
        System.out.println("nhập mã khách hàng mới:");
        String newCustomerId = scanner.nextLine();
        List<Customer> domesticCustomers = domesticCustomersRepository.displayCustomers();
        List<Customer> foreignCustomers = foreignCustomersRepository.displayCustomers();
        domesticCustomers.addAll(foreignCustomers);
        List<Customer> customerList = domesticCustomers;
        boolean checkCustomer = customerList.stream().noneMatch(customer -> customer.getIdCustomer().equals(newCustomerId));
        if (checkCustomer) {
            System.out.println("khách hàng không tồn tại trong danh sách khách hàng , vui lòng thử lại");
        } else {
            bill.setIdCustomer(newCustomerId);
            billList.add(bill);
            billRepository.writeBill(billList);
            System.out.println("sửa mã khách hàng thành công");
        }
    }

    public void deleteBill() {
        displayBillList();
        while (true) {
            System.out.println("--------nhập mã hóa đơn cần xóa--------");
            String idBill = scanner.nextLine();
            try {
                billController.deleteBill(idBill);
                break;
            } catch (FindNotBillIIdException e) {
                System.out.println(e.getMessage());
            }

        }
    }


    public void sortBill() {
        List<Bill> billList = billRepository.getAllBills();
        billList.sort(Comparator.comparing(Bill::getIdBill));
        billRepository.writeBill(billList);

    }
}
