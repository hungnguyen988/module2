package hoa_don_tien_dien.service;

import hoa_don_tien_dien.model.Bill;
import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.repository.BillRepository;
import hoa_don_tien_dien.repository.DomesticCustomersRepository;
import hoa_don_tien_dien.repository.ForeignCustomersRepository;
import hoa_don_tien_dien.validate.FindNotBillIIdException;

import java.util.List;
import java.util.Scanner;

public class BillService {
    private final BillRepository billRepository = new BillRepository();
    private final DomesticCustomersRepository domesticCustomersRepository = new DomesticCustomersRepository();
    private final ForeignCustomersRepository foreignCustomersRepository = new ForeignCustomersRepository();
    Scanner scanner = new Scanner(System.in);

    public void addBill(Bill bill) {
        billRepository.addBill(bill);
        System.out.println("Hóa đơn tiện điện đã được thêm");
    }

    public void displayBillList() {
        System.out.println("Danh sách hóa đơn tiện điện");
        List<Bill> billList = billRepository.getAllBills();
        List<Customer> listDomestic = domesticCustomersRepository.displayCustomers();
        List<Customer> listForeign = foreignCustomersRepository.displayCustomers();
        listDomestic.addAll(listForeign);
        for (Bill bill : billList) {
            for (Customer customer : listDomestic) {
                if (customer.getIdCustomer().equals(bill.getIdCustomer())) {
                    bill.setIdCustomer(customer.getName());
                }
            }
            System.out.println(bill);
        }
    }

    public void deleteBill(String idBill) throws FindNotBillIIdException {
        boolean check = false;
        for (Bill bill : billRepository.getAllBills()) {
            if (bill.getIdBill().equals(idBill)) {
                check = true;
                break;
            }
        }
        if (!check) {
            throw new FindNotBillIIdException("Không tìm thấy hóa đơn với mã " + idBill);
        }else{
            billRepository.deleteBillById(idBill);
            System.out.println("Hóa đơn tiện điện đã được xóa");
        }
    }
}
