package hoa_don_tien_dien.service;

import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.repository.IDomesticCustomerRepository;

import java.util.List;

public class DomesticCustomerService implements IDomesticCustomerService {
    private IDomesticCustomerRepository domesticCustomerRepository;


    public DomesticCustomerService(IDomesticCustomerRepository domesticCustomerRepository) {
        this.domesticCustomerRepository = domesticCustomerRepository;
    }

    @Override
    public void addCustomer(Customer customer) {
        domesticCustomerRepository.addCustomer(customer);
        System.out.println("Thêm khách hàng thành công");
    }



    @Override
    public void getCustomerName(String name) {
        List<Customer> customers = domesticCustomerRepository.getCustomerName(name);
        if (customers.isEmpty()) {
            System.out.println("Không tìm thấy khách hàng nào có tên " + name);
        } else {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }

    }

    @Override
    public void displayCustomers() {
        List<Customer> customerList = domesticCustomerRepository.displayCustomers();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
