package quan_ly_phuong_tien_2.service;

import quan_ly_phuong_tien_2.model.Car;
import quan_ly_phuong_tien_2.model.Vehicle;
import quan_ly_phuong_tien_2.repository.ICarRepository;

public class CarService implements ICarService{
    private ICarRepository carRepository   ;

    public CarService(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void addCar(Car car) {
        carRepository.addCar( car);
        System.out.println("Car added successfully");
    }

    @Override
    public void displayCar() {
        System.out.println("List of cars:");
        carRepository.displayCar();

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
