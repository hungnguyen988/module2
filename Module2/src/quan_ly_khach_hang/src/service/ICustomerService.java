package quan_ly_khach_hang.src.service;

import quan_ly_khach_hang.src.model.Customer;

import java.util.List;

public interface ICustomerService {
    public void createCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public void updateCustomer( Customer customer);
    public void deleteCustomer(int id);
    public Customer getCustomerById(int id);
    public Customer getCustomerByName(String name);
}
