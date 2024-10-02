package quan_ly_phuong_tien_2.repository;

import quan_ly_phuong_tien_2.model.Motorbike;
import quan_ly_phuong_tien_2.model.Vehicle;

public interface IMotorRepository {
    void addMotor(Motorbike motorbike);
    void displayMotor();
    Vehicle getByLicensePlate(String licensePlate);
    boolean delete(String licensePlate);


}
