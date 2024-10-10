package hoa_don_tien_dien.repository;

import hoa_don_tien_dien.model.Customer;
import hoa_don_tien_dien.model.DomesticCustomers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DomesticCustomersRepository implements IDomesticCustomerRepository {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\hoa_don_tien_dien\\data\\khachHang.csv";
    private Customer customer;
    List<Customer> customerList ;

    public DomesticCustomersRepository() {
        this.customerList = new ArrayList<>();
    }


    @Override
    public void addCustomer(Customer domesticCustomer) {
        customerList.add(domesticCustomer);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(domesticCustomer.toString());
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

    public Customer getCustomerById(String idCustomer) {
        readFromFile();
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(idCustomer)) {
                return customer;
            }
        }
        return null;
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
                if (line.isEmpty()) {
                    continue;
                }
                String[] data = line.split(",");
                if (data.length == 4) {
                    customer = new DomesticCustomers(data[0], data[1], data[2], Double.parseDouble(data[3]));
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
