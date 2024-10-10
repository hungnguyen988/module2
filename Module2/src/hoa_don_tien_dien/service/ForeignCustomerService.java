package hoa_don_tien_dien.service;

import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.repository.IForeignCustomerRepository;

import java.util.List;

public class ForeignCustomerService implements IForeignCustomerServiice  {
    private IForeignCustomerRepository foreignCustomersRepository;
    public ForeignCustomerService(IForeignCustomerRepository foreignCustomersRepository) {
        this.foreignCustomersRepository = foreignCustomersRepository;
    }

    @Override
    public void addCustomer(Customer customer) {
        foreignCustomersRepository.addCustomer(customer);
    }

    @Override
    public void getCustomerName(String name) {
        List<Customer> customers = foreignCustomersRepository.getCustomerName(name);
        if (customers.isEmpty()) {
            System.out.println("Không tìm thấy khách hàng");
        }else {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    @Override
    public void displayCustomers() {
        List<Customer> customerList =  foreignCustomersRepository.displayCustomers();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
