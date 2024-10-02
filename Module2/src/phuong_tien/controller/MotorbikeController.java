package phuong_tien.controller;

import phuong_tien.model.Motorbike;
import phuong_tien.service.IVehicleService;
import phuong_tien.service.MotorbikeService;

import java.util.List;

public class MotorbikeController implements IVehicleController<Motorbike> {
    private final IVehicleService<Motorbike> motorbikeService = new MotorbikeService();

    @Override
    public void addVehicle(Motorbike motorbike) {
        motorbikeService.addVehicle(motorbike);
    }

    @Override
    public List<Motorbike> getAllVehicles() {
        return motorbikeService.getAllVehicles();
    }

    @Override
    public Motorbike getVehicleByLicensePlate(String licensePlate) {
        return motorbikeService.getVehicleByLicensePlate(licensePlate);
    }

    @Override
    public void updateVehicle(String licensePlate, Motorbike updatedMotorbike) {
        motorbikeService.updateVehicle(licensePlate, updatedMotorbike);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        motorbikeService.deleteVehicle(licensePlate);
    }
}
