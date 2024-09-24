package quan_ly_phuong_tien_giao_thong.src.repository;

import quan_ly_phuong_tien_giao_thong.src.model.*;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    private List<Car> cars = new ArrayList<>();
    private List<Truck> trucks = new ArrayList<>();
    private List<Motorbike> motorbikes = new ArrayList<>();
    public List<Manufacturer> manufacturers = new ArrayList<>();

    // Constructor để khởi tạo các hãng sản xuất
    public VehicleRepository() {
        createManufacturer(); // Tạo các hãng sản xuất khi khởi tạo
    }

    // Phương thức chỉ tạo hãng sản xuất một lần
    private void createManufacturer() {
        manufacturers.add(new Manufacturer("1", "TOYOTA", "dfd1"));
        manufacturers.add(new Manufacturer("2", "HUYNDAI", "dfd2"));
        manufacturers.add(new Manufacturer("3", "MERCEDES", "dfd3"));
    }


    public void displayManufacturer() {

        for (int i = 0; i < manufacturers.size(); i++) {
            System.out.println((i+1) + ": " + manufacturers.get(i));
        }
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    public void addMotorbike(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Truck> getAllTrucks() {
        return trucks;
    }

    public List<Motorbike> getAllMotorbikes() {
        return motorbikes;
    }

    public boolean deleteVehicleByLicensePlate(String licensePlate) {
        // Delete from cars
        for (Car car : cars) {
            if (car.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                cars.remove(car);
                return true;
            }
        }

        // Delete from trucks
        for (Truck truck : trucks) {
            if (truck.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                trucks.remove(truck);
                return true;
            }
        }

        // Delete from motorbikes
        for (Motorbike motorbike : motorbikes) {
            if (motorbike.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                motorbikes.remove(motorbike);
                return true;
            }
        }

        return false;
    }

    public Vehicle searchVehicleByLicensePlate(String licensePlate) {
        // Search in cars
        for (Car car : cars) {
            if (car.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return car;
            }
        }

        // Search in trucks
        for (Truck truck : trucks) {
            if (truck.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return truck;
            }
        }

        // Search in motorbikes
        for (Motorbike motorbike : motorbikes) {
            if (motorbike.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return motorbike;
            }
        }

        return null;
    }
}
