package doc_ghi_file_phuong_tien.service;



import doc_ghi_file_phuong_tien.model.Motorbike;

import java.util.List;

public interface IMotorbikeService {
    void addMotorbike(Motorbike motorbike);
    List<Motorbike> getAllMotorbikes();
    void displayMotorbikes();
    Motorbike getMotorbikeByLicensePlate(String licensePlate);
    void deleteMotorbike(String licensePlate);
}
