package quan_ly_phuong_tien_giao_thong.src.controller;

import quan_ly_phuong_tien_giao_thong.src.model.Vehicle;

public interface IVehicleController {
    void addCar(String licensePlate, String manufacturer, int year, String owner, int seats, String type);
    void addTruck(String licensePlate, String manufacturer, int year, String owner, double loadCapacity);
    void addMotorbike(String licensePlate, String manufacturer, int year, String owner, double power);
    void displayAllCar();
    void displayAllTruck();
    void displayAllMotorbike();
    boolean deleteVehicle(String licensePlate);
    Vehicle searchVehicle(String licensePlate);
}
