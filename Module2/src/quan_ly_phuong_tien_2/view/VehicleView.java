package quan_ly_phuong_tien_2.view;

import quan_ly_phuong_tien_2.controller.*;
import quan_ly_phuong_tien_2.model.Car;
import quan_ly_phuong_tien_2.model.Motorbike;
import quan_ly_phuong_tien_2.model.Truck;

import java.util.Scanner;

public class VehicleView {
    ITruckController truckController = new TruckController();
    ICarController carController = new CarController();
    IMotorController motorController = new MotorController();

    public VehicleView(ITruckController truckController, ICarController carController, IMotorController motorController) {
        this.truckController = truckController;
        this.carController = carController;
        this.motorController = motorController;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vehicle Management System");
        System.out.println("1. Add vehicle");
        System.out.println("2. Display a vehicles");
        System.out.println("3. Display all vehicles");
        System.out.println("4. Get vehicle by license plate");
        System.out.println("5. Delete vehicle by license plate");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("what type of vehicle do you want to add?");
                System.out.println("1. Truck");
                System.out.println("2. Car");
                System.out.println("3. Motorbike");
                int vehicleType = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter license plate: ");
                String licensePlate = scanner.nextLine();
                System.out.println("Enter manufacturer: ");
                String manufacturer = scanner.nextLine();
                System.out.println("Enter year: ");
                int year = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter owner: ");
                String owner = scanner.nextLine();
                switch (vehicleType) {
                    case 1:
                        System.out.println("Enter load capacity: ");
                        double capacity = Double.parseDouble(scanner.nextLine());
                        truckController.addTruck(new Truck(licensePlate, manufacturer, year, owner, capacity));

                        break;
                    case 2:
                        System.out.println("Enter number of seats: ");
                        int seats = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter type: ");
                        String type = scanner.nextLine();
                        carController.addCar(new Car(licensePlate, manufacturer, year, owner, seats, type));
                        break;
                    case 3:
                        System.out.println("Enter power (in HP): ");
                        double power = Double.parseDouble(scanner.nextLine());
                        motorController.addMotor(new Motorbike(licensePlate, manufacturer, year, owner, power));
                        break;
                    default:
                        System.out.println("Invalid input type!");
                }
                break;
            case 2:
                System.out.println("what type of vehicle do you want to display?");
                System.out.println("1. Truck");
                System.out.println("2. Car");
                System.out.println("3. Motorbike");
                System.out.println("Choose an option: ");
                int vehicleType2 = Integer.parseInt(scanner.nextLine());
                switch (vehicleType2) {
                    case 1:
                        truckController.displayTruck();
                        break;
                    case 2:
                        carController.displayCar();
                        break;
                    case 3:
                        motorController.displayMotor();
                        break;
                    default:
                        System.out.println("Invalid input type!");
                }
                break;
            case 3:
                truckController.displayTruck();
                carController.displayCar();
                motorController.displayMotor();
                break;
            case 4:
                System.out.println("Enter license plate: ");
                String licensePlateSearch = scanner.nextLine();
                truckController.getByLicensePlate(licensePlateSearch);
                carController.getByLicensePlate(licensePlateSearch);
                motorController.getByLicensePlate(licensePlateSearch);
                break;
            case 5:
                System.out.println("Enter license plate: ");
                String licensePlateDelete = scanner.nextLine();
                truckController.delete(licensePlateDelete);
                carController.delete(licensePlateDelete);
                motorController.delete(licensePlateDelete);
                break;
            default:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        VehicleView view = new VehicleView(new TruckController(), new CarController(), new MotorController());
        view.displayMenu();
    }

}
