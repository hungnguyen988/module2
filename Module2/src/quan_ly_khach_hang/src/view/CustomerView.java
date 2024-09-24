package quan_ly_khach_hang.src.view;

import quan_ly_khach_hang.src.model.Customer;

import java.util.List;

public class CustomerView implements ICustomerView{

    // Hiển thị thông tin của một khách hàng
    public void displayCustomerInfo(Customer customer) {
        if (customer != null) {
            System.out.println("ID: " + customer.getId());
            System.out.println("Name: " + customer.getName());
            System.out.println("Address: " + customer.getAddress());
            System.out.println("Phone Number: " + customer.getNumberPhone());
        } else {
            System.out.println("Customer not found!");
        }
    }

    // Hiển thị danh sách tất cả khách hàng
    public void displayAllCustomers(List<Customer> customers) {
        for (Customer customer : customers) {
            displayCustomerInfo(customer);
            System.out.println("---------------------");
        }
    }
}
