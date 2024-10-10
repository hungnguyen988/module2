package bai_thi_module_2.repository;

import bai_thi_module_2.model.GenuinePhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GenuinePhoneRepository {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\bai_thi_module_2\\data\\genuinePhone.csv";
    List<GenuinePhone> genuinePhones = new ArrayList<>();
    public GenuinePhoneRepository() {
    }

    public List<GenuinePhone> getAllGenuinePhones() {
        readFromFile();
        return genuinePhones;
    }

    public void addGenuinePhone(GenuinePhone genuinePhone) {
        genuinePhones.add(genuinePhone);
        writeToFile();
    }

    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (GenuinePhone genuinePhone : genuinePhones) {
                writer.write(genuinePhone.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        genuinePhones.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split(",");
                int id = Integer.parseInt(attributes[0]);
                String name = attributes[1];
                double price = Double.parseDouble(attributes[2]);
                int quantity = Integer.parseInt(attributes[3]);
                String manufacturer = attributes[4];
                int time = Integer.parseInt(attributes[5]);
                String scope = attributes[6];

                GenuinePhone genuinePhone = new GenuinePhone(id, name, price, quantity, manufacturer, time, scope);
                genuinePhones.add(genuinePhone);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePhone(int id){
       List<GenuinePhone> genuinePhoneList = getAllGenuinePhones();
       for (GenuinePhone genuinePhone : genuinePhoneList){
           if (genuinePhone.getId() == id){
               genuinePhoneList.remove(genuinePhone);
               writeToFile();
               return;
           }
       }

    }

    public GenuinePhone findById(int id){
        List<GenuinePhone> genuinePhoneList = getAllGenuinePhones();
        for (GenuinePhone genuinePhone : genuinePhoneList){
            if (genuinePhone.getId() == id){
                return genuinePhone;
            }
        }
        return null;
    }

}
