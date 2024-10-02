package phuong_tien.view;


import phuong_tien.controller.CarController;
import phuong_tien.controller.IVehicleController;
import phuong_tien.controller.MotorbikeController;
import phuong_tien.controller.TruckController;
import phuong_tien.model.Car;
import phuong_tien.model.Motorbike;
import phuong_tien.model.Truck;
import phuong_tien.model.Vehicle;

import java.util.Scanner;

public class VehicleView {
    private final IVehicleController<Car> carController = new CarController();
    private final IVehicleController<Truck> truckController = new TruckController();
    private final IVehicleController<Motorbike> motorbikeController = new MotorbikeController();

    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        boolean running = true;
        while (running) {
            System.out.println("Vehicle Management System");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Display vehicles");
            System.out.println("3. Display all vehicles");
            System.out.println("4. Search vehicle by license plate");
            System.out.println("5. Delete a vehicle");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    displayVehicles();
                    break;
                case 3:
                    displayAllVehicles();
                    break;
                case 4:
                    searchVehicle();
                    break;
                case 5:
                    deleteVehicle();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private void addVehicle() {
        System.out.println("Select vehicle type to add:");
        System.out.println("1. Car");
        System.out.println("2. Truck");
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
                System.out.print("Enter number of seats: ");
                int seats = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter type (e.g., sedan, SUV): ");
                String carType = scanner.nextLine();
                Car car = new Car(licensePlate, manufacturer, year, owner, seats, carType);
                carController.addVehicle(car);
                break;
            case 2:
                System.out.print("Enter load capacity (in tons): ");
                double loadCapacity = Double.parseDouble(scanner.nextLine());
                Truck truck = new Truck(licensePlate, manufacturer, year, owner, loadCapacity);
                truckController.addVehicle(truck);
                break;
            case 3:
                System.out.print("Enter power (in horsepower): ");
                double power = Double.parseDouble(scanner.nextLine());
                Motorbike motorbike = new Motorbike(licensePlate, manufacturer, year, owner, power);
                motorbikeController.addVehicle(motorbike);
                break;
            default:
                System.out.println("Invalid vehicle type.");
        }
    }

    private void displayVehicles() {
        System.out.println("Select vehicle type to display:");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorbike");
        int vehicleType = Integer.parseInt(scanner.nextLine());

        switch (vehicleType) {
            case 1:
                System.out.println("Cars:");
                for (Car car : carController.getAllVehicles()) {
                    System.out.println(car);
                }
                break;
            case 2:
                System.out.println("Trucks:");
                for (Truck truck : truckController.getAllVehicles()) {
                    System.out.println(truck);
                }
                break;
            case 3:
                System.out.println("Motorbikes:");
                for (Motorbike motorbike : motorbikeController.getAllVehicles()) {
                    System.out.println(motorbike);
                }
                break;
            default:
                System.out.println("Invalid vehicle type.");
        }
    }

    private void searchVehicle() {
        System.out.print("Enter license plate to search: ");
        String licensePlate = scanner.nextLine();

        Vehicle vehicle = carController.getVehicleByLicensePlate(licensePlate);
        if (vehicle == null) {
            vehicle = truckController.getVehicleByLicensePlate(licensePlate);
        }
        if (vehicle == null) {
            vehicle = motorbikeController.getVehicleByLicensePlate(licensePlate);
        }

        if (vehicle != null) {
            System.out.println("Vehicle found: " + vehicle);
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    private void deleteVehicle() {
        System.out.print("Enter license plate to delete: ");
        String licensePlate = scanner.nextLine();

        carController.deleteVehicle(licensePlate);
        truckController.deleteVehicle(licensePlate);
        motorbikeController.deleteVehicle(licensePlate);

        System.out.println("If the vehicle existed, it has been deleted.");
    }

    public static void main(String[] args) {
        VehicleView vehicleView = new VehicleView();
        vehicleView.displayMenu();
    }

    public void displayAllVehicles(){
        System.out.println("All vehicles:");
        for (Vehicle vehicle : carController.getAllVehicles()) {
            System.out.println(vehicle);
        }
        for (Vehicle vehicle : truckController.getAllVehicles()) {
            System.out.println(vehicle);
        }
        for (Vehicle vehicle : motorbikeController.getAllVehicles()) {
            System.out.println(vehicle);
        }
    }
}

