import controller.CustomerController;
import controller.ICustomerController;
import model.Customer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICustomerController customerController = new CustomerController();

        while (true) {
            System.out.println("\nCustomer Management System");
            System.out.println("1. Add Customer");
            System.out.println("2. View All Customers");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Find Customer by ID");
            System.out.println("6. Find Customer by NAME");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        // Thêm khách hàng mới
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter Phone Number: ");
                        String numberPhone = scanner.nextLine();
                        customerController.createCustomer(new Customer(id, name, address, numberPhone));
                        break;

                    case 2:
                        // Hiển thị tất cả khách hàng
                        customerController.displayAllCustomers();
                        break;

                    case 3:
                        // Cập nhật thông tin khách hàng
                        System.out.print("Enter Customer ID to Update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter New Address: ");
                        String newAddress = scanner.nextLine();
                        System.out.print("Enter New Phone Number: ");
                        String newPhone = scanner.nextLine();
                        customerController.updateCustomer(new Customer(updateId, newName, newAddress, newPhone));
                        break;

                    case 4:
                        // Xóa khách hàng
                        System.out.print("Enter Customer ID to Delete: ");
                        int deleteId = scanner.nextInt();
                        customerController.deleteCustomer(deleteId);
                        break;

                    case 5:
                        // Tìm khách hàng theo ID
                        System.out.print("Enter Customer ID to Find: ");
                        int findId = scanner.nextInt();
                        customerController.findCustomerById(findId);
                        break;

                    case 6:
                        //Tìm khách hàng theo name
                        System.out.print("Enter Customer NAME to Find: ");
                        String findName = scanner.nextLine();
                        customerController.findCustomerByName(findName);
                        break;

                    case 7:
                        // Thoát chương trình
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid option! Please try again.");
                }
            } catch (InputMismatchException ad) {
//                System.out.println("Invalid option! Please try again.");
                scanner.nextLine();
            }
        }
    }
}
