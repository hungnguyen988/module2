package phuong_tien_doc_ghi_file.repository;

import phuong_tien_doc_ghi_file.model.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\phuong_tien_doc_ghi_file\\data\\cars.csv";
    private List<Car> carList = new ArrayList<>();

    public List<Car> getAllCars() {
        return carList;
    }

    public void addCar(Car car) {
        carList.add(car);
        writeToFile();
    }

    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Car car : carList) {
                writer.write(car.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        carList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                // Tách chuỗi thành các thông tin xe để tái tạo đối tượng Car
                String[] carData = line.split(",");
                if (carData.length!= 6) {
                    System.out.println("dữ liệu xe không đúung định dạng");
                }else {
                    String licensePlate = carData[0];
                    String manufacturer = carData[1];
                    int year = Integer.parseInt(carData[2]);
                    String owner = carData[3];
                    int seats = Integer.parseInt(carData[4]);
                    String type = carData[5];
                    carList.add(new Car(licensePlate, manufacturer, year, owner, seats, type));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
