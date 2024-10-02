package phuong_tien.repository;


import java.util.List;

public interface IVehicleRepository<T> {
    void add(T vehicle); // Create

    List<T> getAll(); // Read

    T getByLicensePlate(String licensePlate); // Read by License Plate

    void update(String licensePlate, T updatedVehicle); // Update

    void delete(String licensePlate); // Delete

}
