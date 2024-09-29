package quan_ly_phuong_tien_2.controller;

import quan_ly_phuong_tien_2.model.Vehicle;

public interface IVehicleController {
    void add(Vehicle vehicle);
    void display();
    Vehicle getByLicensePlate(String licensePlate);
    void delete(String licensePlate);
}
