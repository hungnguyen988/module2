package quan_ly_phuong_tien_giao_thong.src.controller;

import quan_ly_phuong_tien_giao_thong.src.model.Car;
import quan_ly_phuong_tien_giao_thong.src.model.Motorbike;
import quan_ly_phuong_tien_giao_thong.src.model.Truck;
import quan_ly_phuong_tien_giao_thong.src.model.Vehicle;
import quan_ly_phuong_tien_giao_thong.src.service.VehicleService;

import java.util.List;

public class VehicleController {
    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void addCar(String licensePlate, String manufacturer, int year, String owner, int seats, String type) {
        Car car = new Car(licensePlate, manufacturer, year, owner, seats, type);
        vehicleService.addCar(car);
    }

    public void addTruck(String licensePlate, String manufacturer, int year, String owner, double loadCapacity) {
        Truck truck = new Truck(licensePlate, manufacturer, year, owner, loadCapacity);
        vehicleService.addTruck(truck);
    }

    public void addMotorbike(String licensePlate, String manufacturer, int year, String owner, double power) {
        Motorbike motorbike = new Motorbike(licensePlate, manufacturer, year, owner, power);
        vehicleService.addMotorbike(motorbike);
    }

    public void displayAllCar() {
        List<Car> cars = vehicleService.getAllCars();
        System.out.println("Cars:");
        for (Car car : cars) {
            car.displayInfo();
        }
    }

    public void displayAllTruck() {
        List<Truck> trucks = vehicleService.getAllTrucks();
        System.out.println("Trucks:");
        for (Truck truck : trucks) {
            truck.displayInfo();
        }
    }

    public void displayAllMotorbike() {
        List<Motorbike> motorbikes = vehicleService.getAllMotorbikes();
        System.out.println("Motorbikes:");
        for (Motorbike motorbike: motorbikes) {
            motorbike.displayInfo();
        }
    }

    public boolean deleteVehicle(String licensePlate) {
        return vehicleService.deleteVehicleByLicensePlate(licensePlate);
    }

    public Vehicle searchVehicle(String licensePlate) {
        return vehicleService.searchVehicleByLicensePlate(licensePlate);
    }
}
