package phuong_tien_doc_ghi_file.controller;

import phuong_tien_doc_ghi_file.model.Motorbike;
import phuong_tien_doc_ghi_file.service.IMotorbikeService;
import phuong_tien_doc_ghi_file.service.MotorbikeService;

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