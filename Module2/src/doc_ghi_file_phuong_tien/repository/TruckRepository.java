package doc_ghi_file_phuong_tien.repository;


import doc_ghi_file_phuong_tien.model.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TruckRepository {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\doc_ghi_file_phuong_tien\\data\\vehicle.csv";
    private List<Truck> truckList = new ArrayList<>();

    public List<Truck> getAllTrucks() {
        readFromFile();
        return truckList;
    }

    public void addTruck(Truck truck) {
        addOneTruck(truck);
    }

    private static void addOneTruck(Truck truck) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(truck.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            for (Truck truck : truckList) {
                writer.append(truck.toString());
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
                if (truckData[0].equals("Truck")) {
                    String licensePlate = truckData[1];
                    String manufacturer = truckData[2];
                    int year = Integer.parseInt(truckData[3]);
                    String owner = truckData[4];
                    double loadCapacity = Double.parseDouble(truckData[5]);
                    truckList.add(new Truck(licensePlate, manufacturer, year, owner, loadCapacity));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteTruckByLicensePlate(String licensePlated) {
        readFromFile();
        truckList.removeIf(truck -> truck.getLicensePlate().equals(licensePlated));
    }
}
