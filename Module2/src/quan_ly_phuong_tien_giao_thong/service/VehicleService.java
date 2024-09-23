package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.Vehicle;
import quan_ly_phuong_tien_giao_thong.repository.IVehicleRepository;
import quan_ly_phuong_tien_giao_thong.repository.VehicleRepository;

import java.util.List;

public class VehicleService implements IVehicleService {
    private IVehicleRepository vehicleRepository;
    public VehicleService() {
        this.vehicleRepository =  new VehicleRepository();
    }

    public Vehicle get(String licensePlateNumber){
       return vehicleRepository.getVehicle(licensePlateNumber);
    }

    public List<Vehicle> display(){
        return vehicleRepository.displayVehicleList();
    }


    public void add(Vehicle vehicle){
        vehicleRepository.addVehicle(vehicle);
    }


    public void remove(String licensePlateNumber){
        vehicleRepository.removeVehicle(licensePlateNumber);
    }
}
