package doc_ghi_file_phuong_tien.service;




import doc_ghi_file_phuong_tien.model.Truck;

import java.util.List;

public interface ITruckService {
    void addTruck(Truck truck);
    List<Truck> getAllTrucks();
    void displayTrucks();
    Truck getTruckByLicensePlate(String licensePlate);
    void deleteTruck(String licensePlate);
}
