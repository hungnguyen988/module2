package hoa_don_tien_dien.controller;

import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.service.IForeignCustomerServiice;

public class ForeignCustomerController {
    private final IForeignCustomerServiice foreignCustomerService ;

    public ForeignCustomerController(IForeignCustomerServiice foreignCustomerService) {
        this.foreignCustomerService = foreignCustomerService;
    }


    public void addCustomer(Customer customer) {
        foreignCustomerService.addCustomer(customer);
    }

    public void updateCustomer(Customer customer) {}

    public void deleteCustomer(Customer customer) {}

    public void findCustomerByName(String name) {
        foreignCustomerService.getCustomerName(name);
    }

    public void displayCustomers() {
        foreignCustomerService.displayCustomers();
    }
}
