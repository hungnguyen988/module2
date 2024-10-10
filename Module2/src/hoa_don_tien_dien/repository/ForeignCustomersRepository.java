package hoa_don_tien_dien.repository;

import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.model.ForeignCustomers;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForeignCustomersRepository implements IForeignCustomerRepository {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\hoa_don_tien_dien\\data\\khachHang.csv";
    private Customer customer;
    private List<Customer> customerList;

    public ForeignCustomersRepository() {
        customerList = new ArrayList<>();

    }


    @Override
    public void addCustomer(Customer foreignCustomer) {
        customerList.add(foreignCustomer);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(foreignCustomer.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Customer> getCustomerName(String name) {
        List<Customer> result = new ArrayList<>();
        readFromFile();
        for (Customer customer : customerList) {
            if (customer.getName().equalsIgnoreCase(name)) {
                result.add(customer);
            }
        }
        return result;
    }

    @Override
    public List<Customer> displayCustomers() {
        readFromFile();
        return customerList;
    }

    public void readFromFile() {
        customerList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] customerData = line.split(",");
                if (customerData.length == 3) {
                    customer = new ForeignCustomers(customerData[0], customerData[1], customerData[2]);
                    customerList.add(customer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeToFile(List<Customer> customerList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            for (Customer customer : customerList) {
                writer.write(customer.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
