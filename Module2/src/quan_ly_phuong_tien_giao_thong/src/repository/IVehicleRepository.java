package quan_ly_phuong_tien_giao_thong.src.repository;

import quan_ly_phuong_tien_giao_thong.src.model.*;

import java.util.List;

public interface IVehicleRepository {
    public void addManufacturer(Manufacturer manufacturer);
    public void displayManufacturer();
    public void addCar(Car car);
    public void addTruck(Truck truck);
    public void addMotorbike(Motorbike motorbike);
    public List<Car> getAllCars();
    public List<Truck> getAllTrucks();
    public List<Motorbike> getAllMotorbikes();
    public boolean deleteVehicleByLicensePlate(String licensePlate);
    public Vehicle searchVehicleByLicensePlate(String licensePlate);

}
