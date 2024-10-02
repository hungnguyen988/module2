package quan_ly_phuong_tien_2.service;

import quan_ly_phuong_tien_2.model.Motorbike;
import quan_ly_phuong_tien_2.model.Vehicle;

public interface IMotorService {
    void addMotor(Motorbike motorbike);
    void displayMotor();
    Vehicle getByLicensePlate(String licensePlate);
    void delete(String licensePlate);
}
