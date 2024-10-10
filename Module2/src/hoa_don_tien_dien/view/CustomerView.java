package hoa_don_tien_dien.view;

import hoa_don_tien_dien.controller.DomesticCustomerController;
import hoa_don_tien_dien.controller.ForeignCustomerController;
import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.model.DomesticCustomers;
import hoa_don_tien_dien.model.ForeignCustomers;
import hoa_don_tien_dien.repository.DomesticCustomersRepository;
import hoa_don_tien_dien.repository.ForeignCustomersRepository;
import hoa_don_tien_dien.service.DomesticCustomerService;
import hoa_don_tien_dien.service.ForeignCustomerService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class CustomerView {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\hoa_don_tien_dien\\data\\khachHang.csv";

    Scanner scanner = new Scanner(System.in);
    private final DomesticCustomerController domesticCustomerController = new DomesticCustomerController(new DomesticCustomerService(new DomesticCustomersRepository()));
    private final ForeignCustomerController foreignCustomerController = new ForeignCustomerController(new ForeignCustomerService(new ForeignCustomersRepository()));
    private final DomesticCustomersRepository domesticCustomersRepository = new DomesticCustomersRepository();
    private final ForeignCustomersRepository foreignCustomersRepository = new ForeignCustomersRepository();

    public void displayMenu() {
        while (true) {
            try {
                System.out.println("--------------Quản lý khách hàng----------------");
                System.out.println("1. Thêm mới khách hàng");
                System.out.println("2. Hiển thị danh sách khách hàng");
                System.out.println("3. Tìm kiếm khách hàng theo tên");
                System.out.println("4. Hiển thị từng danh sách");
                System.out.println("0. Thoát");
                System.out.print("Choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("-----------Thêm mới khách hàng------------");
                        addCustomer();
                        break;
                    case 2:
                        displayAllCustomers();
                        break;
                    case 3:
                        searchCustomerByName();
                        break;
                    case 4:
                        displayCustomerList();
                        break;
                    case 0:
                        System.out.println("Thoát");
                        System.exit(0);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
                scanner.nextLine(); // discard the invalid input
            }
        }


    }

    public void addCustomer() {
        try {
            System.out.println("Nhập phạm vi khách hàng:");
            System.out.println("1.Trong nước");
            System.out.println("2.Nước ngoài");
            int scope = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên khách hàng:");
            String name = scanner.nextLine();
            String idCustomer;
            switch (scope) {
                case 1:
                    do {
                        System.out.println("Nhập mã khách hàng:");
                        idCustomer = scanner.nextLine();
                    } while (validateIdCustomer(idCustomer, "(KHVN)-([0-9]{5})", domesticCustomersRepository.displayCustomers()));
                    String type = "";
                    do {
                        System.out.println("Nhập loại khách hàng");
                        System.out.println("1.Sinh hoạt");
                        System.out.println("2.Kinh doanh");
                        System.out.println("3.Sản xuất");
                        System.out.print("Choice: ");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                type = "Sinh hoạt";
                                break;
                            case 2:
                                type = "Kinh doanh";
                                break;
                            case 3:
                                type = "Sản xuất";
                                break;
                            default:
                                System.out.println("Loại khách hàng không hợp lệ");
                                break;
                        }
                    } while (type.isEmpty());


                    System.out.println("Nhập định mức tiêu thụ");
                    double norm = Double.parseDouble(scanner.nextLine());
                    domesticCustomerController.addCustomer(new DomesticCustomers(idCustomer, name, type, norm));
                    break;
                case 2:
                    do {
                        System.out.println("Nhập mã khách hàng:");
                        idCustomer = scanner.nextLine();
                    } while (validateIdCustomer(idCustomer, "(KHNN)-([0-9]{5})", foreignCustomersRepository.displayCustomers()));

                    System.out.println("Nhập quốc tịch");
                    String country = scanner.nextLine();
                    foreignCustomerController.addCustomer(new ForeignCustomers(idCustomer, name, country));
                    break;
                default:
                    System.out.println("Loại khách hàng không hợp lệ");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("vui lòng nhập đúng thông tin");
            scanner.nextLine();
        }
        sortCustomers();
    }


    public boolean validateIdCustomer(String idCustomer, String regex, List<Customer> customers) {
        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(idCustomer);
            if (!matcher.matches()) {
                System.out.println("Mã khách hàng không hợp lệ. Vui lòng nhập đúng định dạng (KHVN-XXXXX) hoặc (KHNN-XXXXX)");
                return true;
            }
            boolean found = false;
            for (Customer customer : customers) {
                if (customer.getIdCustomer().equals(idCustomer)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Khách hàng có mã " + idCustomer + " đã tồn tại.");
            }
            return found;

        } catch (PatternSyntaxException e) {
            System.out.println("Lỗi: " + e.getMessage());
            return true;
        }


    }


    public void displayCustomerList() {
        try {
            System.out.println("------------Danh sách khách hàng------------");
            System.out.println("1. Khách hàng trong nước");
            System.out.println("2. Khách hàng nước ngoài");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    domesticCustomerController.displayCustomers();
                    break;
                case 2:
                    foreignCustomerController.displayCustomers();
                    break;
                default:
                    System.out.println("Loại khách hàng không hợp lệ");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số!");
            scanner.nextLine();
        }
    }

    public void displayAllCustomers() {
        sortCustomers();
        System.out.println("-------------Danh sách tất cả khách hàng--------------");
        domesticCustomerController.displayCustomers();
        foreignCustomerController.displayCustomers();
    }

    public void searchCustomerByName() {
        // Tìm kiếm khách hàng theo tên
        System.out.println("nhập tên khách hàng cần tìm:");
        String name = scanner.nextLine();
        System.out.println("Danh sách khách hàng có tên " + name + ":");
        domesticCustomerController.findCustomerByName(name);
        foreignCustomerController.findCustomerByName(name);

    }


    public void sortCustomers() {
        List<Customer> domesticCustomers = domesticCustomersRepository.displayCustomers();
        List<Customer> foreignCustomers = foreignCustomersRepository.displayCustomers();
        domesticCustomers.sort(Comparator.comparing(Customer::getIdCustomer));
        foreignCustomers.sort(Comparator.comparing(Customer::getIdCustomer));
        List<Customer> allCustomers = new ArrayList<>(domesticCustomers);
        allCustomers.addAll(foreignCustomers);
        writeToFile(allCustomers);
    }

    public void writeToFile(List<Customer> customers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Customer customer : customers) {
                writer.write(customer.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


