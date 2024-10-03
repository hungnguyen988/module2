package doc_ghi_file_phuong_tien.service;


import doc_ghi_file_phuong_tien.model.Motorbike;
import doc_ghi_file_phuong_tien.repository.MotorbikeRepository;

import java.util.List;

public class MotorbikeService implements IMotorbikeService {

    private final MotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    @Override
    public void addMotorbike(Motorbike motorbike) {

        motorbikeRepository.addMotorbike(motorbike);

    }

    @Override
    public List<Motorbike> getAllMotorbikes() {

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
        motorbikeRepository.deleteMotorbikeByLicensePlate(licensePlate);
    }
}
