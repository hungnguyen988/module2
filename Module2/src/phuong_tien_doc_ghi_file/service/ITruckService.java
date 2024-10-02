package phuong_tien_doc_ghi_file.service;


import phuong_tien_doc_ghi_file.model.Truck;

import java.util.List;

public interface ITruckService {
    void addTruck(Truck truck);
    List<Truck> getAllTrucks();
    void displayTrucks();
    Truck getTruckByLicensePlate(String licensePlate);
    void deleteTruck(String licensePlate);
}
