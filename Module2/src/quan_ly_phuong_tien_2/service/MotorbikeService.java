package quan_ly_phuong_tien_2.service;

import quan_ly_phuong_tien_2.model.Motorbike;
import quan_ly_phuong_tien_2.model.Vehicle;
import quan_ly_phuong_tien_2.repository.IVehicleRepository;

public class MotorbikeService implements IVehicleService {
    private IVehicleRepository motorbikeRepository;

    public MotorbikeService(IVehicleRepository motorbikeRepository) {
        this.motorbikeRepository = motorbikeRepository;
    }

    @Override
    public void add(Vehicle motorbike) {
        motorbikeRepository.add((Motorbike) motorbike);
        System.out.println("Motorbike added successfully!");
    }

    @Override
    public void display() {
        System.out.println("Motorbikes:");
        motorbikeRepository.display();
    }

    @Override
    public Vehicle getByLicensePlate(String licensePlate) {
        if (motorbikeRepository.getByLicensePlate(licensePlate)== null) {
            throw new IllegalArgumentException("Motorbike not found!");
        }else {
            return motorbikeRepository.getByLicensePlate(licensePlate);
        }
    }

    @Override
    public void delete(String licensePlate) {
        if (!motorbikeRepository.delete(licensePlate)) {
            throw new IllegalArgumentException("Motorbike not found!");
        }else {
            motorbikeRepository.delete(licensePlate);
            System.out.println("Motorbike deleted successfully!");
        }
    }
}
