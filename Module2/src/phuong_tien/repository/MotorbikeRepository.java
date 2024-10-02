package phuong_tien.repository;



import phuong_tien.model.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IVehicleRepository<Motorbike> {
    private List<Motorbike> motorbikes = new ArrayList<>();

    @Override
    public void add(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    @Override
    public List<Motorbike> getAll() {

        return motorbikes;
    }

    @Override
    public Motorbike getByLicensePlate(String licensePlate) {
        for (Motorbike motorbike : motorbikes) {
            if (motorbike.getLicensePlate().equals(licensePlate)) {
                return motorbike;
            }
        }
        return null;
    }

    @Override
    public void update(String licensePlate, Motorbike updatedMotorbike) {
        Motorbike motorbike = getByLicensePlate(licensePlate);
        if (motorbike != null) {
            motorbikes.set(motorbikes.indexOf(motorbike), updatedMotorbike);
        }
    }

    @Override
    public void delete(String licensePlate) {
        motorbikes.removeIf(motorbike -> motorbike.getLicensePlate().equals(licensePlate));
    }
}
