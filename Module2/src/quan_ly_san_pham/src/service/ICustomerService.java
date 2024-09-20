package quan_ly_san_pham.src.service;

import quan_ly_san_pham.src.model.Customer;

import java.util.List;

public interface ICustomerService {
    public void createCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public void updateCustomer( Customer customer);
    public void deleteCustomer(int id);
    public Customer getCustomerById(int id);
    public Customer getCustomerByName(String name);
}
