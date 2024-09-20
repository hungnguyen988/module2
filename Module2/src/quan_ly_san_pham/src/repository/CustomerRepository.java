package quan_ly_san_pham.src.repository;

import quan_ly_san_pham.src.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private List<Customer> customerList;

    public CustomerRepository() {
        this.customerList = new ArrayList<>();
    }

    // Lấy danh sách tất cả khách hàng
    public List<Customer> findAll() {
        if (customerList.isEmpty()) {
            System.out.println("No customers found");
        }
        return customerList;
    }

    // Tìm khách hàng theo ID
    public Customer findById(int id) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    //Tìm khách hàng theo tên
    public Customer findByName(String name) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    // Thêm khách hàng mới
    public void add(Customer customer) {
        customerList.add(customer);
    }

    // Cập nhật khách hàng
    public void update(Customer customer) {
        Customer existingCustomer = findById(customer.getId());
        if (existingCustomer != null) {
            existingCustomer.setName(customer.getName());
            existingCustomer.setAddress(customer.getAddress());
            existingCustomer.setNumberPhone(customer.getNumberPhone());
        }
    }


    // Xóa khách hàng theo ID
    public void delete(int id) {
        customerList.removeIf(customer -> customer.getId() == id);
    }


    //sắp xếp list sau khi xóa
    public void sortAfterDeletion(int id) {
        for (Customer customer : customerList) {
            if (customer.getId()>id){
                customer.setId(customer.getId()-1);
            }
        }
    }
}



