package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.model.Vehicle;

import java.util.List;

public interface IVehicleRepository {
    public Vehicle getVehicle(String licensePlateNumber);
    public List<Vehicle> displayVehicleList();
    public void addVehicle(Vehicle vehicle);
    public void removeVehicle(String licensePlateNumber);

}
