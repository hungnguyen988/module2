package quan_ly_phuong_tien_2.repository;

import quan_ly_phuong_tien_2.model.Truck;
import quan_ly_phuong_tien_2.model.Vehicle;

public interface ITruckRepository {
    void addTruck(Truck truck);
    void displayTruck();
    Vehicle getByLicensePlate(String licensePlate);
    boolean delete(String licensePlate);
}
