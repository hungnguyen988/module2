package quan_ly_phuong_tien_2.repository;

import quan_ly_phuong_tien_2.model.Motorbike;
import quan_ly_phuong_tien_2.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorRepository {
    List<Motorbike> motorbikes = new ArrayList<>();

    public MotorbikeRepository() {
    }

    @Override
    public void addMotor(Motorbike motorbike) {
        motorbikes.add( motorbike);
    }

    @Override
    public void displayMotor() {
        if (motorbikes.isEmpty()) {
            System.out.println("No motorbikes found.");
        }else {
            for (Vehicle motorbike : motorbikes) {
                System.out.println(motorbike.toString());
            }
        }

    }

    @Override
    public Vehicle getByLicensePlate(String licensePlate) {
        for (Vehicle motorbike : motorbikes) {
            if (motorbike.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return motorbike;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String licensePlate) {
        Vehicle motorbike = getByLicensePlate(licensePlate);
        if (motorbike!= null) {
            motorbikes.remove(motorbike);
            return true;
        }
        return false;
    }


}
