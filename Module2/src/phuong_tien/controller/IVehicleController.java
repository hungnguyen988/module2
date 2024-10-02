package phuong_tien.controller;



import java.util.List;

public interface IVehicleController<T> {
    void addVehicle(T vehicle); // Create
    List<T> getAllVehicles(); // Read
    T getVehicleByLicensePlate(String licensePlate); // Read by License Plate
    void updateVehicle(String licensePlate, T updatedVehicle); // Update
    void deleteVehicle(String licensePlate); // Delete
}

