package quan_ly_phuong_tien_2.repository;

import quan_ly_phuong_tien_2.model.Vehicle;

public interface IVehicleRepository {
    void add(Vehicle vehicle);
    void display();
    Vehicle getByLicensePlate(String licensePlate);
    boolean delete(String licensePlate);


}
