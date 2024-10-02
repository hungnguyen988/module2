package phuong_tien.service;


import phuong_tien.model.Car;
import phuong_tien.repository.CarRepository;

import java.util.List;

public class CarService implements IVehicleService<Car> {
    private final CarRepository carRepository = new CarRepository();

    @Override
    public void addVehicle(Car car) {
        carRepository.add(car);
    }

    @Override
    public List<Car> getAllVehicles() {
        return carRepository.getAll();
    }

    @Override
    public Car getVehicleByLicensePlate(String licensePlate) {
        return carRepository.getByLicensePlate(licensePlate);
    }

    @Override
    public void updateVehicle(String licensePlate, Car updatedCar) {
        carRepository.update(licensePlate, updatedCar);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        carRepository.delete(licensePlate);
    }
}

