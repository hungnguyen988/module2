package quan_ly_phuong_tien_2.controller;

import quan_ly_phuong_tien_2.model.Car;
import quan_ly_phuong_tien_2.model.Vehicle;
import quan_ly_phuong_tien_2.service.ICarService;

public class CarController implements ICarController {
    ICarService carService;
    public CarController(ICarService carService) {
        this.carService = carService;
    }

    public CarController() {

    }


    @Override
    public void addCar(Car car) {
        carService.addCar(car);
    }

    @Override
    public void displayCar() {
        carService.displayCar();
    }

    @Override
    public Vehicle getByLicensePlate(String licensePlate) {
      return carService.getByLicensePlate(licensePlate);

    }

    @Override
    public void delete(String licensePlate) {
        carService.delete(licensePlate);
    }
}
