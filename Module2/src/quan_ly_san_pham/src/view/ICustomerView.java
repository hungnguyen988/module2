package quan_ly_san_pham.src.view;

import quan_ly_san_pham.src.model.Customer;

import java.util.List;

public interface ICustomerView {
    public void displayAllCustomers(List<Customer> customers);
    public void displayCustomerInfo(Customer customer);
}
