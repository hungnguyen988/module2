package view;

import model.Customer;

import java.util.List;

public interface ICustomerView {
    public void displayAllCustomers(List<Customer> customers);
    public void displayCustomerInfo(Customer customer);
}
