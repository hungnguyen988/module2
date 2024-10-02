package quan_ly_phuong_tien_2.controller;

import quan_ly_phuong_tien_2.model.Truck;
import quan_ly_phuong_tien_2.model.Vehicle;

public interface ITruckController {
    void addTruck(Truck truck);
    void displayTruck();
    Vehicle getByLicensePlate(String licensePlate);
    void delete(String licensePlate);
}
