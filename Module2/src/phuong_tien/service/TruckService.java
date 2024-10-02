package phuong_tien.service;


import phuong_tien.model.Truck;
import phuong_tien.repository.TruckRepository;

import java.util.List;

public class TruckService implements IVehicleService<Truck> {
    private final TruckRepository truckRepository = new TruckRepository();

    @Override
    public void addVehicle(Truck truck) {
        truckRepository.add(truck);
    }

    @Override
    public List<Truck> getAllVehicles() {
        return truckRepository.getAll();
    }

    @Override
    public Truck getVehicleByLicensePlate(String licensePlate) {
        return truckRepository.getByLicensePlate(licensePlate);
    }

    @Override
    public void updateVehicle(String licensePlate, Truck updatedTruck) {
        truckRepository.update(licensePlate, updatedTruck);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        truckRepository.delete(licensePlate);
    }
}

