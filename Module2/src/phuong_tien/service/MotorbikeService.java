package phuong_tien.service;


import phuong_tien.model.Motorbike;
import phuong_tien.repository.MotorbikeRepository;

import java.util.List;

public class MotorbikeService implements IVehicleService<Motorbike> {
    private final MotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    @Override
    public void addVehicle(Motorbike motorbike) {
        motorbikeRepository.add(motorbike);
    }

    @Override
    public List<Motorbike> getAllVehicles() {
        return motorbikeRepository.getAll();
    }

    @Override
    public Motorbike getVehicleByLicensePlate(String licensePlate) {
        return motorbikeRepository.getByLicensePlate(licensePlate);
    }

    @Override
    public void updateVehicle(String licensePlate, Motorbike updatedMotorbike) {
        motorbikeRepository.update(licensePlate, updatedMotorbike);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        motorbikeRepository.delete(licensePlate);
    }
}
