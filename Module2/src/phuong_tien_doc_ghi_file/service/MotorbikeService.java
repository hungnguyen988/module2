package phuong_tien_doc_ghi_file.service;

import phuong_tien_doc_ghi_file.model.Motorbike;
import phuong_tien_doc_ghi_file.repository.MotorbikeRepository;

import java.util.List;

public class MotorbikeService implements IMotorbikeService {
    private final MotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    @Override
    public void addMotorbike(Motorbike motorbike) {
        motorbikeRepository.addMotorbike(motorbike);
    }

    @Override
    public List<Motorbike> getAllMotorbikes() {
        motorbikeRepository.readFromFile();
        return motorbikeRepository.getAllMotorbikes();
    }

    @Override
    public void displayMotorbikes() {
        List<Motorbike> motorbikes = motorbikeRepository.getAllMotorbikes();
        for (Motorbike motorbike : motorbikes) {
            System.out.println(motorbike);
        }
    }

    @Override
    public Motorbike getMotorbikeByLicensePlate(String licensePlate) {
        for (Motorbike motorbike : motorbikeRepository.getAllMotorbikes()) {
            if (motorbike.getLicensePlate().equals(licensePlate)) {
                return motorbike;
            }
        }
        return null;
    }

    @Override
    public void deleteMotorbike(String licensePlate) {
        List<Motorbike> motorbikes = motorbikeRepository.getAllMotorbikes();
        motorbikes.removeIf(motorbike -> motorbike.getLicensePlate().equals(licensePlate));
        motorbikeRepository.writeToFile();
    }
}
