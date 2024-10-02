package phuong_tien.controller;

import phuong_tien.model.Truck;
import phuong_tien.service.IVehicleService;
import phuong_tien.service.TruckService;

import java.util.List;

public class TruckController implements IVehicleController<Truck> {
    private final IVehicleService<Truck> truckService = new TruckService();

    @Override
    public void addVehicle(Truck truck) {
        truckService.addVehicle(truck);
    }

    @Override
    public List<Truck> getAllVehicles() {
        return truckService.getAllVehicles();
    }

    @Override
    public Truck getVehicleByLicensePlate(String licensePlate) {
        return truckService.getVehicleByLicensePlate(licensePlate);
    }

    @Override
    public void updateVehicle(String licensePlate, Truck updatedTruck) {
        truckService.updateVehicle(licensePlate, updatedTruck);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        truckService.deleteVehicle(licensePlate);
    }
}
