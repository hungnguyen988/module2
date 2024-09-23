package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    public Vehicle get(String licensePlateNumber);
    public List<Vehicle> display();
    public void add(Vehicle vehicle);
    public void remove(String licensePlateNumber);
}
