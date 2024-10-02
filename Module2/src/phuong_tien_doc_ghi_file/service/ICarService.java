package phuong_tien_doc_ghi_file.service;

import phuong_tien_doc_ghi_file.model.Car;

import java.util.List;

public interface ICarService {
    void addCar(Car car);
    List<Car> getAllCars();
    void displayCars();
    Car getCarByLicensePlate(String licensePlate);
    void deleteCar(String licensePlate);
}
