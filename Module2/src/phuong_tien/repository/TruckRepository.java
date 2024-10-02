package phuong_tien.repository;



import phuong_tien.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements IVehicleRepository<Truck> {
    private List<Truck> trucks = new ArrayList<>();

    @Override
    public void add(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public List<Truck> getAll() {
        return trucks;
    }

    @Override
    public Truck getByLicensePlate(String licensePlate) {
        for (Truck truck : trucks) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                return truck;
            }
        }
        return null;
    }

    @Override
    public void update(String licensePlate, Truck updatedTruck) {
        Truck truck = getByLicensePlate(licensePlate);
        if (truck != null) {
            trucks.set(trucks.indexOf(truck), updatedTruck);
        }
    }

    @Override
    public void delete(String licensePlate) {
        trucks.removeIf(truck -> truck.getLicensePlate().equals(licensePlate));
    }
}

