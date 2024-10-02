package quan_ly_phuong_tien_2.service;

import quan_ly_phuong_tien_2.model.Truck;
import quan_ly_phuong_tien_2.model.Vehicle;
import quan_ly_phuong_tien_2.repository.IMotorRepository;
import quan_ly_phuong_tien_2.repository.ITruckRepository;

public class TruckService implements ITruckService  {
    private ITruckRepository truckRepository;

    public TruckService(ITruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    @Override
    public void addTruck(Truck truck) {
        truckRepository.addTruck( truck);
        System.out.println("Truck added successfully!");
    }

    @Override
    public void displayTruck() {
        System.out.println("List of Trucks:");
        truckRepository.displayTruck();
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
