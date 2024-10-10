package bai_thi_module_2.repository;

import bai_thi_module_2.model.PortablePhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PortablePhoneRepository {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\bai_thi_module_2\\data\\portablePhone.csv";
    private List<PortablePhone> portablePhoneList = new ArrayList<>();

    public PortablePhoneRepository() {
    }

    public List<PortablePhone> getAllPortablePhones() {
        readFromFile();
        return portablePhoneList;
    }

    public void addPortablePhone(PortablePhone portablePhone) {
        portablePhoneList.add(portablePhone);
        writeToFile();
    }

    private void readFromFile() {
        portablePhoneList.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split(",");
                int id = Integer.parseInt(attributes[0]);
                String name = attributes[1];
                double price = Double.parseDouble(attributes[2]);
                int quantity = Integer.parseInt(attributes[3]);
                String manufacturer = attributes[4];
                String country = attributes[5];
                String status = attributes[6];

                PortablePhone portablePhone = new PortablePhone(id, name, price, quantity, manufacturer, country, status);
                portablePhoneList.add(portablePhone);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (PortablePhone portablePhone : portablePhoneList) {
                writer.write(portablePhone.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePhone(int id){
        List<PortablePhone> portablePhoneList = getAllPortablePhones();
        for (PortablePhone portablePhone : portablePhoneList){
            if(portablePhone.getId() == id){
                portablePhoneList.remove(portablePhone);
                writeToFile();
                break;
            }
        }
    }

    public PortablePhone findPhoneById(int id){
        List<PortablePhone> portablePhoneList = getAllPortablePhones();
        for (PortablePhone portablePhone : portablePhoneList){
            if(portablePhone.getId() == id){
                return portablePhone;
            }
        }
        return null;
    }
}
