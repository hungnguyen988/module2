package phuong_tien_doc_ghi_file.service;

import phuong_tien_doc_ghi_file.model.Car;
import phuong_tien_doc_ghi_file.repository.CarRepository;

import java.util.List;

public class CarService implements ICarService {
    private final CarRepository carRepository = new CarRepository();

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    @Override
    public List<Car> getAllCars() {
        carRepository.readFromFile();
        return carRepository.getAllCars();
    }

    @Override
    public void displayCars() {
        List<Car> cars = carRepository.getAllCars();
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public Car getCarByLicensePlate(String licensePlate) {
        for (Car car : carRepository.getAllCars()) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public void deleteCar(String licensePlate) {
        List<Car> cars = carRepository.getAllCars();
        cars.removeIf(car -> car.getLicensePlate().equals(licensePlate));
        carRepository.writeToFile();
    }
}
