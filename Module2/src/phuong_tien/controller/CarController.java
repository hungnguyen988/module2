package phuong_tien.controller;

import phuong_tien.model.Car;
import phuong_tien.service.CarService;
import phuong_tien.service.IVehicleService;

import java.util.List;

public class CarController implements IVehicleController<Car> {
    private final IVehicleService<Car> carService = new CarService();

    @Override
    public void addVehicle(Car car) {
        carService.addVehicle(car);
    }

    @Override
    public List<Car> getAllVehicles() {
        return carService.getAllVehicles();
    }

    @Override
    public Car getVehicleByLicensePlate(String licensePlate) {
        return carService.getVehicleByLicensePlate(licensePlate);
    }

    @Override
    public void updateVehicle(String licensePlate, Car updatedCar) {
        carService.updateVehicle(licensePlate, updatedCar);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        carService.deleteVehicle(licensePlate);
    }
}
