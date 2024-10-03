package doc_ghi_file_phuong_tien.controller;



import doc_ghi_file_phuong_tien.model.Car;
import doc_ghi_file_phuong_tien.service.CarService;
import doc_ghi_file_phuong_tien.service.ICarService;

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
