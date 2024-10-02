package quan_ly_phuong_tien_2.repository;

import quan_ly_phuong_tien_2.model.Truck;
import quan_ly_phuong_tien_2.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    List<Truck> trucks = new ArrayList<>();

    public TruckRepository() {
        trucks.add(new Truck("ABC-123", "Toyota", 2020,"Camry",  100000));
        trucks.add(new Truck("DEF-456", "Ford", 2019,"Mustang",  150000));
    }

    @Override
    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public void displayTruck() {
        if (trucks.isEmpty()) {
            System.out.println("No trucks found.");
        }else {
            for (Truck truck : trucks) {
                System.out.println(truck.toString());
            }
        }
    }

    @Override
    public Vehicle getByLicensePlate(String licensePlate) {
        for (Truck truck : trucks) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                return truck;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String licensePlate) {
        Vehicle truck = getByLicensePlate(licensePlate);
        if (truck != null) {
            trucks.remove(truck);
            return true;
        }else {
            return false;
        }
    }
}
