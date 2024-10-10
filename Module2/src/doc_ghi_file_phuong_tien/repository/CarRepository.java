package doc_ghi_file_phuong_tien.repository;


import doc_ghi_file_phuong_tien.model.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\doc_ghi_file_phuong_tien\\data\\vehicle.csv";
    private List<Car> carList = new ArrayList<>();

    public List<Car> getAllCars() {
        readFromFile();
        return carList;
    }

    public void addCar(Car car) {
        addOneCar(car);

    }

    private static void addOneCar(Car car) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(car.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
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
                if (carData[0].equals("Car")) {
                    String licensePlate = carData[1];
                    String manufacturer = carData[2];
                    int year = Integer.parseInt(carData[3]);
                    String owner = carData[4];
                    int seats = Integer.parseInt(carData[5]);
                    String type = carData[6];
                    carList.add(new Car(licensePlate, manufacturer, year, owner, seats, type));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteCarByLicensePlate(String licensePlated) {
        readFromFile();
        carList.removeIf(car -> car.getLicensePlate().equals(licensePlated));
    }
}
