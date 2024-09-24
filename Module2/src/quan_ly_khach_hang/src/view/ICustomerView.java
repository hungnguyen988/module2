package quan_ly_khach_hang.src.view;

import quan_ly_khach_hang.src.model.Customer;

import java.util.List;

public interface ICustomerView {
    public void displayAllCustomers(List<Customer> customers);
    public void displayCustomerInfo(Customer customer);
}
