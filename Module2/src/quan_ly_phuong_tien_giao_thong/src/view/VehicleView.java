package quan_ly_phuong_tien_giao_thong.src.view;

import quan_ly_phuong_tien_giao_thong.src.controller.VehicleController;
import quan_ly_phuong_tien_giao_thong.src.model.Vehicle;
import quan_ly_phuong_tien_giao_thong.src.repository.VehicleRepository;

import java.util.Scanner;

public class VehicleView {
    private VehicleController vehicleController;
    private VehicleRepository vehicleRepository;
    private Scanner scanner;

    public VehicleView(VehicleController vehicleController) {
        this.vehicleController = vehicleController;
        this.vehicleRepository = new VehicleRepository();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int choice;

        do {
            showMenuOptions();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    displayVehicles();
                    break;
                case 3:
                    deleteVehicle();
                    break;
                case 4:
                    searchVehicle();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private void showMenuOptions() {
        System.out.println("\nVehicle Management System");
        System.out.println("1. Add new vehicle");
        System.out.println("2. Display vehicles");
        System.out.println("3. Delete vehicle");
        System.out.println("4. Search vehicle by license plate");
        System.out.println("5. Exit");
        System.out.print("Please choose an option: ");
    }

    public void addVehicle() {
        System.out.println("1. Add Truck");
        System.out.println("2. Add Car");
        System.out.println("3. Add Motorbike");
        System.out.print("Choose the type of vehicle to add: ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter license plate: ");
        String licensePlate = scanner.nextLine();

        String manufacturer = enterManufacturer();
        System.out.print("Enter year of manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter owner: ");
        String owner = scanner.nextLine();

        switch (type) {
            case 1:
                System.out.print("Enter load capacity (in tons): ");
                double loadCapacity = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                vehicleController.addTruck(licensePlate, manufacturer, year, owner, loadCapacity);
                System.out.println("Truck added successfully.");
                break;
            case 2:
                System.out.print("Enter number of seats: ");
                int seats = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter type (e.g., du lịch, xe khách): ");
                String carType = scanner.nextLine();
                vehicleController.addCar(licensePlate, manufacturer, year, owner, seats, carType);
                System.out.println("Car added successfully.");
                break;
            case 3:
                System.out.print("Enter power (in HP): ");
                double power = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                vehicleController.addMotorbike(licensePlate, manufacturer, year, owner, power);
                System.out.println("Motorbike added successfully.");
                break;
            default:
                System.out.println("Invalid vehicle type.");
        }
    }

    private void deleteVehicle() {
        System.out.print("Enter the license plate of the vehicle to delete: ");
        String licensePlate = scanner.nextLine();

        boolean success = vehicleController.deleteVehicle(licensePlate);

        if (success) {
            System.out.println("Vehicle deleted successfully.");
        } else {
            System.out.println("No vehicle found with the given license plate.");
        }
    }

    private void searchVehicle() {
        System.out.print("Enter the license plate of the vehicle to search: ");
        String licensePlate = scanner.nextLine();

        Vehicle vehicle = vehicleController.searchVehicle(licensePlate);

        if (vehicle != null) {
            vehicle.displayInfo();
        } else {
            System.out.println("No vehicle found with the given license plate.");
        }
    }

    private String enterManufacturer() {
        int model = 0;
        String manufacturer = "";
        do {
            System.out.println("Enter manufacturer: ");
            vehicleRepository.displayManufacturer();
            System.out.println("Enter model: ");
            model = scanner.nextInt();
            scanner.nextLine();
            switch (model) {
                case 1:
                    manufacturer = "TOYOTA";
                    break;
                case 2:
                    manufacturer = "HUYNDAI";
                    break;
                case 3:
                    manufacturer = "MERCEDES";
                    break;

//                default:
//                    System.out.println("Invalid manufacturer. Please try again.");
            }
        } while (model < 1 || model > 3);
        return manufacturer;
    }

    public void displayVehicles() {
        System.out.println("Vehicle Management System");
        System.out.println("1. Display Truck");
        System.out.println("2. Display Car");
        System.out.println("3. Display Motorbike");
        System.out.println("4. Exit");
        int choice =0;
        while (choice<1||choice>4) {
            System.out.print("Please choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    vehicleController.displayAllTruck();
                    break;
                case 2:
                    vehicleController.displayAllCar();
                    break;
                case 3:
                    vehicleController.displayAllMotorbike();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


    }
}
