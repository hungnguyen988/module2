package doc_ghi_file_phuong_tien.service;


import doc_ghi_file_phuong_tien.model.Car;
import doc_ghi_file_phuong_tien.repository.CarRepository;

import java.util.List;

public class CarService implements ICarService {
    private final CarRepository carRepository = new CarRepository();

    @Override
    public void addCar(Car car) {

        carRepository.addCar(car);

    }

    @Override
    public List<Car> getAllCars() {

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
        carRepository.deleteCarByLicensePlate(licensePlate);
    }
}
