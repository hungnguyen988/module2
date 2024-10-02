package phuong_tien_doc_ghi_file.repository;

import phuong_tien_doc_ghi_file.model.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TruckRepository {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\phuong_tien_doc_ghi_file\\data\\trucks.csv";
    private List<Truck> truckList = new ArrayList<>();

    public List<Truck> getAllTrucks() {
        return truckList;
    }

    public void addTruck(Truck truck) {
        truckList.add(truck);
        writeToFile();
    }

    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Truck truck : truckList) {
                writer.write(truck.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        truckList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                // Tách chuỗi thành các thông tin xe để tái tạo đối tượng Truck
                String[] truckData = line.split(",");
                if (truckData.length!= 5) {
                    String licensePlate = truckData[0];
                    String manufacturer = truckData[1];
                    int year = Integer.parseInt(truckData[2]);
                    String owner = truckData[3];
                    double loadCapacity = Double.parseDouble(truckData[4]);
                    truckList.add(new Truck(licensePlate, manufacturer, year, owner, loadCapacity));
                }else {
                    System.out.println("dữ liệu  xe không đúng định dạng");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
