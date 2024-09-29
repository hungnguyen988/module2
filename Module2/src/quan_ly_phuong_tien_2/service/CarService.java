package quan_ly_phuong_tien_2.service;

import quan_ly_phuong_tien_2.model.Car;
import quan_ly_phuong_tien_2.model.Vehicle;
import quan_ly_phuong_tien_2.repository.IVehicleRepository;

public class CarService implements IVehicleService{
    private IVehicleRepository carRepository;

    public CarService(IVehicleRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void add(Vehicle car) {
        carRepository.add((Car) car);
        System.out.println("Car added successfully");
    }

    @Override
    public void display() {
        System.out.println("List of cars:");
        carRepository.display();

    }

    @Override
    public Vehicle getByLicensePlate(String licensePlate) {
        if (carRepository.getByLicensePlate(licensePlate) == null) {
            throw new IllegalArgumentException("Car not found");
        }else {
            return carRepository.getByLicensePlate(licensePlate);
        }
    }

    @Override
    public void delete(String licensePlate) {
        if (!carRepository.delete(licensePlate)) {
            throw new IllegalArgumentException("Car not found");
        }else {
            carRepository.delete(licensePlate);
            System.out.println("Car deleted successfully");
        }
    }
}
