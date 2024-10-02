package quan_ly_phuong_tien_2.controller;

import quan_ly_phuong_tien_2.model.Car;
import quan_ly_phuong_tien_2.model.Vehicle;

public interface ICarController {
    void addCar(Car car);
    void displayCar();
    Vehicle getByLicensePlate(String licensePlate);
    void delete(String licensePlate);
}
