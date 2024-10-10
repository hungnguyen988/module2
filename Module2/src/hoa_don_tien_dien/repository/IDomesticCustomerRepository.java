package hoa_don_tien_dien.repository;

import hoa_don_tien_dien.model.Customer;

import java.util.List;

public interface IDomesticCustomerRepository {
     void addCustomer(Customer customer);
    List<Customer> getCustomerName(String name);
    List<Customer> displayCustomers();
}
