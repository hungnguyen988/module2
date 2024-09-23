package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IVehicleRepository {
    private List<Vehicle> vehicleList;

    public VehicleRepository() {
        vehicleList = new ArrayList<Vehicle>();
    }


    public Vehicle getVehicle(String licensePlateNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getLicensePlateNumber() == licensePlateNumber) {
                return vehicle;
            }
        }
        return null;
    }


    public List<Vehicle> displayVehicleList() {
        if (vehicleList.isEmpty()) {
            System.out.println("carsList is empty");
        }
        return vehicleList;
    }

    ;

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    ;

    public void removeVehicle(String licensePlateNumber) {
        vehicleList.removeIf(vehicle -> vehicle.getLicensePlateNumber() == licensePlateNumber);
    }

    

}
