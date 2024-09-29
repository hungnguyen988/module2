package quan_ly_phuong_tien_2.repository;

import quan_ly_phuong_tien_2.model.Car;
import quan_ly_phuong_tien_2.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements IVehicleRepository {
    List<Car> carList = new ArrayList<>();
    public CarRepository() {
    }



    @Override
    public void add(Vehicle car) {
        carList.add((Car) car);
    }

    @Override
    public void display() {
        if (carList.isEmpty()) {
            System.out.println("No car found!");
        }else {
            for (Vehicle car : carList) {
                System.out.println(car.toString());
            }
        }
    }

    @Override
    public Vehicle getByLicensePlate(String licensePlate) {
        for (Vehicle car : carList) {
            if (car.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String licensePlate) {
        Vehicle car = getByLicensePlate(licensePlate);
        if (car!= null) {
            carList.remove(car);
            return true;
        }else {
            return false;
        }

    }
}
