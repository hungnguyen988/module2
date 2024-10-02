package phuong_tien.repository;

import phuong_tien.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements IVehicleRepository<Car>  {
    private List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getAll() {

        return cars;
    }

    @Override
    public Car getByLicensePlate(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }
        return null; // Nếu không tìm thấy
    }

    @Override
    public void update(String licensePlate, Car updatedCar) {
        Car car = getByLicensePlate(licensePlate);
        if (car != null) {
            cars.set(cars.indexOf(car), updatedCar);
        }
    }

    @Override
    public void delete(String licensePlate) {
        cars.removeIf(car -> car.getLicensePlate().equals(licensePlate));
    }


}
