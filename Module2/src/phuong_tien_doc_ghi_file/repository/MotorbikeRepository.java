package phuong_tien_doc_ghi_file.repository;

import phuong_tien_doc_ghi_file.model.Motorbike;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\phuong_tien_doc_ghi_file\\data\\motorbikes.csv";
    private List<Motorbike> motorbikeList = new ArrayList<>();

    public List<Motorbike> getAllMotorbikes() {
        return motorbikeList;
    }

    public void addMotorbike(Motorbike motorbike) {
        motorbikeList.add(motorbike);
        writeToFile();
    }

    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Motorbike motorbike : motorbikeList) {
                writer.write(motorbike.toString());
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
                if (line.isEmpty()){
                    continue;
                }
                // Tách chuỗi thành các thông tin xe để tái tạo đối tượng Motorbike
                String[] motorbikeData = line.split(",");
                if (motorbikeData.length!= 5) {
                    System.err.println("Dữ liệu xe không đúng đ��nh dạng: " + line);
                }else {
                    String licensePlate = motorbikeData[0];
                    String manufacturer = motorbikeData[1];
                    int year = Integer.parseInt(motorbikeData[2]);
                    String owner = motorbikeData[3];
                    double power = Double.parseDouble(motorbikeData[4]);
                    motorbikeList.add(new Motorbike(licensePlate, manufacturer, year, owner, power));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
