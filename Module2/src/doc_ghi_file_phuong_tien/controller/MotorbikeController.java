package doc_ghi_file_phuong_tien.controller;



import doc_ghi_file_phuong_tien.model.Motorbike;
import doc_ghi_file_phuong_tien.service.IMotorbikeService;
import doc_ghi_file_phuong_tien.service.MotorbikeService;

import java.util.List;

public class MotorbikeController {
    private IMotorbikeService motorbikeService = new MotorbikeService();

    public void addMotorbike(Motorbike motorbike) {
        motorbikeService.addMotorbike(motorbike);
    }

    public void displayMotorbikes() {
        List<Motorbike> motorbikes = motorbikeService.getAllMotorbikes();
        if (motorbikes.isEmpty()) {
            System.out.println("No motorbikes available.");
        } else {
            for (Motorbike motorbike : motorbikes) {
                System.out.println(motorbike.toString());
            }
        }
    }

    public Motorbike getMotorbikeByLicensePlate(String licensePlate) {
        return motorbikeService.getMotorbikeByLicensePlate(licensePlate);
    }

    public void deleteMotorbike(String licensePlate) {
        motorbikeService.deleteMotorbike(licensePlate);
    }
}