package doc_ghi_file_phuong_tien.service;


import doc_ghi_file_phuong_tien.model.Truck;
import doc_ghi_file_phuong_tien.repository.TruckRepository;

import java.util.List;

public class TruckService implements ITruckService {

    private final TruckRepository truckRepository = new TruckRepository();

    @Override
    public void addTruck(Truck truck) {

        truckRepository.addTruck(truck);

    }

    @Override
    public List<Truck> getAllTrucks() {

        return truckRepository.getAllTrucks();
    }

    @Override
    public void displayTrucks() {
        List<Truck> trucks = truckRepository.getAllTrucks();
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    @Override
    public Truck getTruckByLicensePlate(String licensePlate) {
        for (Truck truck : truckRepository.getAllTrucks()) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                return truck;
            }
        }
        return null;
    }

    @Override
    public void deleteTruck(String licensePlate) {
        truckRepository.deleteTruckByLicensePlate(licensePlate);
    }
}
