package quan_ly_khach_hang.src.controller;


import quan_ly_khach_hang.src.model.Customer;
import quan_ly_khach_hang.src.service.CustomerService;
import quan_ly_khach_hang.src.service.ICustomerService;
import quan_ly_khach_hang.src.view.CustomerView;
import quan_ly_khach_hang.src.view.ICustomerView;

import java.util.List;

public class CustomerController implements ICustomerController {
    private ICustomerService customerService;
    private ICustomerView customerView;

    public CustomerController() {
        this.customerService = new CustomerService();
        this.customerView = new CustomerView();
    }

    // Gọi chức năng tạo khách hàng
    public void createCustomer(Customer customer) {
        customerService.createCustomer(customer);
    }

    // Hiển thị tất cả khách hàng
    public void displayAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        customerView.displayAllCustomers(customers);
    }

    // Cập nhật khách hàng
    public void updateCustomer(Customer customer) {
        customerService.updateCustomer(customer);
    }

    // Xóa khách hàng
    public void deleteCustomer(int id) {
        customerService.deleteCustomer(id);
    }

    // Tìm khách hàng theo ID
    public void findCustomerById(int id) {
        Customer customer = customerService.getCustomerById(id);
        customerView.displayCustomerInfo(customer);
    }

    // Tìm khách hàng theo NAME
    public void findCustomerByName(String name) {
        Customer customer = customerService.getCustomerByName(name);
        customerView.displayCustomerInfo(customer);
    }
}
