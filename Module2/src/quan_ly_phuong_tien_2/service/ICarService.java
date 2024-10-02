package quan_ly_phuong_tien_2.service;

import quan_ly_phuong_tien_2.model.Car;
import quan_ly_phuong_tien_2.model.Vehicle;

public interface ICarService {
    void addCar(Car car);
    void displayCar();
    Vehicle getByLicensePlate(String licensePlate);
    void delete(String licensePlate);
}
