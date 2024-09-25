package quan_ly_phuong_tien_giao_thong.src.service;

import quan_ly_phuong_tien_giao_thong.src.model.Car;
import quan_ly_phuong_tien_giao_thong.src.model.Motorbike;
import quan_ly_phuong_tien_giao_thong.src.model.Truck;
import quan_ly_phuong_tien_giao_thong.src.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    public void addCar(Car car);
    public void addTruck(Truck truck);
    public void addMotorbike(Motorbike motorbike);
    public List<Car> getAllCars();
    public List<Truck> getAllTrucks();
    public List<Motorbike> getAllMotorbikes();
    public boolean deleteVehicleByLicensePlate(String licensePlate);
    public Vehicle searchVehicleByLicensePlate(String licensePlate);
}
