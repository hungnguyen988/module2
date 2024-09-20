package controller;

import model.Customer;

public interface ICustomerController {
    public void createCustomer(Customer customer);
    public void displayAllCustomers();
    public void updateCustomer(Customer customer);
    public void deleteCustomer(int id);
    public void findCustomerById(int id);
    public void findCustomerByName(String name);
}
