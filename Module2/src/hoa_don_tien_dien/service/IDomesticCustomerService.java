package hoa_don_tien_dien.service;

import hoa_don_tien_dien.model.Customer;

import java.util.List;

public interface IDomesticCustomerService {
    void addCustomer(Customer customer);
    void getCustomerName(String name);
    void displayCustomers();
}
