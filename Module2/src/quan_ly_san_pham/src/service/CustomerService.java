package quan_ly_san_pham.src.service;

import quan_ly_san_pham.src.model.Customer;
import quan_ly_san_pham.src.repository.CustomerRepository;
import quan_ly_san_pham.src.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository;

    public CustomerService() {
        this.customerRepository = new CustomerRepository();
    }

    // Tạo khách hàng mới
    public void createCustomer(Customer customer) {

        customerRepository.add(customer);
        System.out.println("Customer created successfully!");
    }

    // Lấy tất cả khách hàng
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Cập nhật khách hàng
    public void updateCustomer( Customer customer) {
        customerRepository.update(customer);
        System.out.println("Customer updated successfully!");
    }

    // Xóa khách hàng theo ID
    public void deleteCustomer(int id) {
        customerRepository.delete(id);
        customerRepository.sortAfterDeletion(id);
        System.out.println("Customer deleted successfully!");
    }

    // Tìm khách hàng theo ID
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    // Tìm khách hàng theo NAME
    public Customer getCustomerByName(String name) {
        return customerRepository.findByName(name);
    }
}

