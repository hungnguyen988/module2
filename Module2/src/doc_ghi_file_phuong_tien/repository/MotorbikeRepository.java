package doc_ghi_file_phuong_tien.repository;


import doc_ghi_file_phuong_tien.model.Motorbike;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository {

    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\doc_ghi_file_phuong_tien\\data\\vehicle.csv";
    private List<Motorbike> motorbikeList = new ArrayList<>();

    public List<Motorbike> getAllMotorbikes() {
        readFromFile();
        return motorbikeList;
    }

    public void addMotorbike(Motorbike motorbike) {
        motorbikeList.add(motorbike);
        addOneMotorbike(motorbike);
    }

    private static void addOneMotorbike(Motorbike motorbike) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {

            writer.write(motorbike.toString());
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {

            for (Motorbike motorbike : motorbikeList) {
                writer.append(motorbike.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readFromFile() {
        motorbikeList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                // Tách chuỗi thành các thông tin xe để tái tạo đối tượng Motorbike
                String[] motorbikeData = line.split(",");
                if (motorbikeData[0].equals("Motorbike")) {
                    String licensePlate = motorbikeData[1];
                    String manufacturer = motorbikeData[2];
                    int year = Integer.parseInt(motorbikeData[3]);
                    String owner = motorbikeData[4];
                    double power = Double.parseDouble(motorbikeData[5]);
                    motorbikeList.add(new Motorbike(licensePlate, manufacturer, year, owner, power));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteMotorbikeByLicensePlate(String licensePlated) {
        readFromFile();
        motorbikeList.removeIf(motorbike -> motorbike.getLicensePlate().equals(licensePlated));
    }
}
