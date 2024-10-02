package phuong_tien_doc_ghi_file.service;

import phuong_tien_doc_ghi_file.model.Motorbike;

import java.util.List;

public interface IMotorbikeService {
    void addMotorbike(Motorbike motorbike);
    List<Motorbike> getAllMotorbikes();
    void displayMotorbikes();
    Motorbike getMotorbikeByLicensePlate(String licensePlate);
    void deleteMotorbike(String licensePlate);
}
