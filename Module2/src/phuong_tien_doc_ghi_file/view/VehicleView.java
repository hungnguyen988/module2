package phuong_tien_doc_ghi_file.view;





import phuong_tien_doc_ghi_file.controller.CarController;
import phuong_tien_doc_ghi_file.controller.MotorbikeController;
import phuong_tien_doc_ghi_file.controller.TruckController;
import phuong_tien_doc_ghi_file.model.Car;
import phuong_tien_doc_ghi_file.model.Motorbike;
import phuong_tien_doc_ghi_file.model.Truck;

import java.util.Scanner;

public class VehicleView {
    private final CarController carController = new CarController();
    private final TruckController truckController = new TruckController();
    private final MotorbikeController motorbikeController = new MotorbikeController();
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
        System.out.print("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();
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

    private void displayVehiclesByType() {
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
        truckController.deleteTruck(licensePlate);
        carController.deleteCar(licensePlate);
        motorbikeController.deleteMotorbike(licensePlate);
        System.out.println("If the vehicle existed, it was deleted successfully.");
    }

    public static void main(String[] args) {
        VehicleView view = new VehicleView();
        view.displayMenu();
    }
}

