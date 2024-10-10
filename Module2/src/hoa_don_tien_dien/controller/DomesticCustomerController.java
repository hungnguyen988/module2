package hoa_don_tien_dien.controller;

import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.service.IDomesticCustomerService;

public class DomesticCustomerController {
    private IDomesticCustomerService domesticCustomerService;


    public DomesticCustomerController(IDomesticCustomerService domesticCustomerService) {
        this.domesticCustomerService = domesticCustomerService;
    }

    public void addCustomer(Customer customer) {
        domesticCustomerService.addCustomer(customer);
    }

    public void updateCustomer(Customer customer) {
    }

    public void deleteCustomer(Customer customer) {}

    public void findCustomerByName(String name) {
       domesticCustomerService.getCustomerName(name);
    }

    public void displayCustomers() {
        domesticCustomerService.displayCustomers();
    }
}
