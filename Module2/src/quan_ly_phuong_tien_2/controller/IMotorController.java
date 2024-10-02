package quan_ly_phuong_tien_2.controller;

import quan_ly_phuong_tien_2.model.Motorbike;
import quan_ly_phuong_tien_2.model.Vehicle;

public interface IMotorController {
    void addMotor(Motorbike motorbike);
    void displayMotor();
    Vehicle getByLicensePlate(String licensePlate);
    void delete(String licensePlate);
}
