package quan_ly_phuong_tien_2.service;

import quan_ly_phuong_tien_2.model.Vehicle;

public interface IVehicleService {
    void add(Vehicle vehicle);
    void display();
    Vehicle getByLicensePlate(String licensePlate);
    void delete(String licensePlate);

}
