package quan_ly_phuong_tien_giao_thong.src.service;

import quan_ly_phuong_tien_giao_thong.src.model.Car;
import quan_ly_phuong_tien_giao_thong.src.model.Motorbike;
import quan_ly_phuong_tien_giao_thong.src.model.Truck;
import quan_ly_phuong_tien_giao_thong.src.model.Vehicle;
import quan_ly_phuong_tien_giao_thong.src.repository.IVehicleRepository;
import quan_ly_phuong_tien_giao_thong.src.repository.VehicleRepository;

import java.util.List;

public class VehicleService implements IVehicleService  {
    private IVehicleRepository vehicleRepository;

    public VehicleService(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void addCar(Car car) {

        vehicleRepository.addCar(car);
    }

    public void addTruck(Truck truck) {

        vehicleRepository.addTruck(truck);
    }

    public void addMotorbike(Motorbike motorbike) {

        vehicleRepository.addMotorbike(motorbike);
    }

    public List<Car> getAllCars() {

        return vehicleRepository.getAllCars();
    }

    public List<Truck> getAllTrucks() {

        return vehicleRepository.getAllTrucks();
    }

    public List<Motorbike> getAllMotorbikes() {

        return vehicleRepository.getAllMotorbikes();
    }

    public boolean deleteVehicleByLicensePlate(String licensePlate) {
        return vehicleRepository.deleteVehicleByLicensePlate(licensePlate);
    }

    public Vehicle searchVehicleByLicensePlate(String licensePlate) {
        return vehicleRepository.searchVehicleByLicensePlate(licensePlate);
    }
}
