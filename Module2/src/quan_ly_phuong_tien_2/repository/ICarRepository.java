package quan_ly_phuong_tien_2.repository;

import quan_ly_phuong_tien_2.model.Car;
import quan_ly_phuong_tien_2.model.Vehicle;

public interface ICarRepository {
    void addCar(Car car);
    void displayCar();
    Vehicle getByLicensePlate(String licensePlate);
    boolean delete(String licensePlate);
}
