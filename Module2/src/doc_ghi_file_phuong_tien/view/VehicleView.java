package doc_ghi_file_phuong_tien.view;


import doc_ghi_file_phuong_tien.controller.CarController;
import doc_ghi_file_phuong_tien.controller.MotorbikeController;
import doc_ghi_file_phuong_tien.controller.TruckController;
import doc_ghi_file_phuong_tien.model.Car;
import doc_ghi_file_phuong_tien.model.Motorbike;
import doc_ghi_file_phuong_tien.model.Truck;
import doc_ghi_file_phuong_tien.repository.CarRepository;
import doc_ghi_file_phuong_tien.repository.ManufacturerRepository;
import doc_ghi_file_phuong_tien.repository.MotorbikeRepository;
import doc_ghi_file_phuong_tien.repository.TruckRepository;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VehicleView {
    private CarRepository carRepository = new CarRepository();
    private TruckRepository truckRepository = new TruckRepository();
    private MotorbikeRepository motorbikeRepository = new MotorbikeRepository();
    private  final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\doc_ghi_file_phuong_tien\\data\\vehicle.csv";
    private final CarController carController = new CarController();
    private final TruckController truckController = new TruckController();
    private final MotorbikeController motorbikeController = new MotorbikeController();
    private final ManufacturerRepository manufacturerRepository = new ManufacturerRepository();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("\nVehicle Management System");
            System.out.println("1. Add vehicle");
            System.out.println("2. Display vehicles by type");
            System.out.println("3. Display all vehicles");
            System.out.println("4. Get vehicle by license plate");
            System.out.println("5. Delete vehicle by license plate");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    displayVehiclesByType();
                    break;
                case 3:
                    displayAllVehicles();
                    break;
                case 4:
                    getVehicleByLicensePlate();
                    break;
                case 5:
                    deleteVehicleByLicensePlate();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private void addVehicle() {
        System.out.println("\nWhat type of vehicle do you want to add?");
        System.out.println("1. Truck");
        System.out.println("2. Car");
        System.out.println("3. Motorbike");
        int vehicleType = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter license plate: ");
        String licensePlate = scanner.nextLine();
        System.out.println("Enter manufacturer: ");
        String manufacturer = choiceManufacturer();
        if (manufacturer == null) return;
        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter owner: ");
        String owner = scanner.nextLine();

        switch (vehicleType) {
            case 1:
                System.out.print("Enter load capacity: ");
                double capacity = Double.parseDouble(scanner.nextLine());
                truckController.addTruck(new Truck(licensePlate, manufacturer, year, owner, capacity));
                System.out.println("Truck added successfully!");
                break;
            case 2:
                System.out.print("Enter number of seats: ");
                int seats = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter car type (e.g., SUV, Sedan): ");
                String type = scanner.nextLine();
                carController.addCar(new Car(licensePlate, manufacturer, year, owner, seats, type));
                System.out.println("Car added successfully!");
                break;
            case 3:
                System.out.print("Enter power (in HP): ");
                double power = Double.parseDouble(scanner.nextLine());
                motorbikeController.addMotorbike(new Motorbike(licensePlate, manufacturer, year, owner, power));
                System.out.println("Motorbike added successfully!");
                break;
            default:
                System.out.println("Invalid vehicle type.");
        }
    }

    private String choiceManufacturer() {
        manufacturerRepository.getAllManufacturers();
        try{
            System.out.print("choice:");
            int manufacturerName = Integer.parseInt(scanner.nextLine());
            String manufacturer;
            switch (manufacturerName) {
                case 1:
                    manufacturer = "Toyota";
                    break;
                case 2:
                    manufacturer = "Honda";
                    break;
                case 3:
                    manufacturer = "Ford";
                    break;
                case 4:
                    manufacturer = "BMW";
                    break;
                case 5:
                    manufacturer = "Mercedes";
                    break;
                default:
                    System.out.println("Invalid manufacturer name.");
                    return null;
            }
            return manufacturer;
        }catch (NumberFormatException e){
            System.out.println("Invalid input. Please enter a number.");
            return null;
        }

    }

    private void displayVehiclesByType() {
        try {
            System.out.println("\nWhat type of vehicle do you want to display?");
            System.out.println("1. Truck");
            System.out.println("2. Car");
            System.out.println("3. Motorbike");
            int vehicleType = Integer.parseInt(scanner.nextLine());

            switch (vehicleType) {
                case 1:
                    truckController.displayTrucks();
                    break;
                case 2:
                    carController.displayCars();
                    break;
                case 3:
                    motorbikeController.displayMotorbikes();
                    break;
                default:
                    System.out.println("Invalid vehicle type.");
            }
        }catch (NumberFormatException e){
            System.out.println("Invalid input. Please enter a number.");
        }

    }

    private void displayAllVehicles() {
        System.out.println("\nDisplaying all vehicles:");
        truckController.displayTrucks();
        carController.displayCars();
        motorbikeController.displayMotorbikes();
    }

    private void getVehicleByLicensePlate() {
        System.out.print("\nEnter the license plate to search: ");
        String licensePlate = scanner.nextLine();
        Truck truck = truckController.getTruckByLicensePlate(licensePlate);
        Car car = carController.getCarByLicensePlate(licensePlate);
        Motorbike motorbike = motorbikeController.getMotorbikeByLicensePlate(licensePlate);

        if (truck != null) {
            System.out.println("Truck found: " + truck);
        } else if (car != null) {
            System.out.println("Car found: " + car);
        } else if (motorbike != null) {
            System.out.println("Motorbike found: " + motorbike);
        } else {
            System.out.println("No vehicle found with the given license plate.");
        }
    }

    private void deleteVehicleByLicensePlate() {
        System.out.print("\nEnter the license plate to delete: ");
        String licensePlate = scanner.nextLine();
        truckRepository.deleteTruckByLicensePlate(licensePlate);
        carRepository.deleteCarByLicensePlate(licensePlate);
        motorbikeRepository.deleteMotorbikeByLicensePlate(licensePlate);
        clearFile();
        truckRepository.writeToFile();
        carRepository.writeToFile();
        motorbikeRepository.writeToFile();
        System.out.println("If the vehicle existed, it was deleted successfully.");
    }


    public boolean clearFile( ) {
        try (FileWriter fileWriter = new FileWriter(FILE_PATH)) {
            fileWriter.write("");
            return true;
        } catch (IOException e) {
            System.out.println("Lỗi khi xóa dữ liệu trong file: " + e.getMessage());
            return false;
        }

    }

    public static void main(String[] args) {
        VehicleView view = new VehicleView();
        view.displayMenu();
    }
}

