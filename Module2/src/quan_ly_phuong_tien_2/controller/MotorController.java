package quan_ly_phuong_tien_2.controller;

import quan_ly_phuong_tien_2.model.Motorbike;
import quan_ly_phuong_tien_2.model.Vehicle;
import quan_ly_phuong_tien_2.service.IMotorService;

public class MotorController implements IMotorController  {
    IMotorService motorService ;

    public MotorController(IMotorService motorService) {
        this.motorService = motorService;
    }

    public MotorController() {

    }

    @Override
    public void addMotor(Motorbike motorbike) {
        motorService.addMotor(motorbike);
    }

    @Override
    public void displayMotor() {
        motorService.displayMotor();
    }

    @Override
    public Vehicle getByLicensePlate(String licensePlate) {

        return motorService.getByLicensePlate(licensePlate);

    }

    @Override
    public void delete(String licensePlate) {
        motorService.delete(licensePlate);
    }
}
