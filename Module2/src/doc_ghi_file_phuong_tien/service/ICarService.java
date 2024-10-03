package doc_ghi_file_phuong_tien.service;



import doc_ghi_file_phuong_tien.model.Car;

import java.util.List;

public interface ICarService {
    void addCar(Car car);
    List<Car> getAllCars();
    void displayCars();
    Car getCarByLicensePlate(String licensePlate);
    void deleteCar(String licensePlate);
}
