package phuong_tien_doc_ghi_file.controller;

import phuong_tien_doc_ghi_file.model.Car;
import phuong_tien_doc_ghi_file.service.CarService;
import phuong_tien_doc_ghi_file.service.ICarService;

import java.util.List;

public class CarController {
    private ICarService carService = new CarService();

    public void addCar(Car car) {
        carService.addCar(car);
    }

    public void displayCars() {
        List<Car> cars = carService.getAllCars();
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            for (Car car : cars) {
                System.out.println(car.toString());
            }
        }
    }

    public Car getCarByLicensePlate(String licensePlate) {
        return carService.getCarByLicensePlate(licensePlate);
    }

    public void deleteCar(String licensePlate) {
        carService.deleteCar(licensePlate);
    }
}
