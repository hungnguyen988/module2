package phuong_tien_doc_ghi_file.controller;

import phuong_tien_doc_ghi_file.model.Truck;
import phuong_tien_doc_ghi_file.service.ITruckService;
import phuong_tien_doc_ghi_file.service.TruckService;

import java.util.List;

public class TruckController {
    private ITruckService truckService = new TruckService();

    public void addTruck(Truck truck) {
        truckService.addTruck(truck);
    }

    public void displayTrucks() {
        List<Truck> trucks = truckService.getAllTrucks();
        if (trucks.isEmpty()) {
            System.out.println("No trucks available.");
        } else {
            for (Truck truck : trucks) {
                System.out.println(truck.toString());
            }
        }
    }

    public Truck getTruckByLicensePlate(String licensePlate) {
        return truckService.getTruckByLicensePlate(licensePlate);
    }

    public void deleteTruck(String licensePlate) {
        truckService.deleteTruck(licensePlate);
    }
}
