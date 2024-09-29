package quan_ly_phuong_tien_2.service;

import quan_ly_phuong_tien_2.model.Truck;
import quan_ly_phuong_tien_2.model.Vehicle;
import quan_ly_phuong_tien_2.repository.IVehicleRepository;

public class TruckService implements IVehicleService  {
    private IVehicleRepository truckRepository;

    public TruckService(IVehicleRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    @Override
    public void add(Vehicle truck) {
        truckRepository.add((Truck) truck);
        System.out.println("Truck added successfully!");
    }

    @Override
    public void display() {
        System.out.println("List of Trucks:");
        truckRepository.display();
    }

    @Override
    public Vehicle getByLicensePlate(String licensePlate) {
        if (truckRepository.getByLicensePlate(licensePlate) == null) {
            throw new IllegalArgumentException("Truck not found!");
        }else {
            return truckRepository.getByLicensePlate(licensePlate);
        }
    }

    @Override
    public void delete(String licensePlate) {
        if (!truckRepository.delete(licensePlate)) {
            throw new IllegalArgumentException("Truck not found!");
        } else {
            System.out.println("Truck deleted successfully!");
        }
    }
}
