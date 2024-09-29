package quan_ly_phuong_tien_2.view;

import quan_ly_phuong_tien_2.model.Car;
import quan_ly_phuong_tien_2.model.Motorbike;
import quan_ly_phuong_tien_2.model.Truck;
import quan_ly_phuong_tien_2.repository.IVehicleRepository;
import quan_ly_phuong_tien_2.service.IVehicleService;

import java.util.Scanner;

public class VehicleView {
    IVehicleService vehicleService;
    IVehicleRepository vehicleRepository;

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
                        vehicleService.add(new Truck(licensePlate, manufacturer, year, owner, capacity));

                        break;
                    case 2:
                        System.out.println("Enter number of seats: ");
                        int seats = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter type: ");
                        String type = scanner.nextLine();
                        vehicleService.add(new Car(licensePlate, manufacturer, year, owner, seats, type));
                        break;
                    case 3:
                        System.out.println("Enter power (in HP): ");
                        double power = Double.parseDouble(scanner.nextLine());
                        vehicleService.add(new Motorbike(licensePlate, manufacturer, year, owner, power));
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

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    default:
                        System.out.println("Invalid input type!");
                }
        }
    }

}
