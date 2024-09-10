package ss3.thuc_hanh;

import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {

        System.out.println("menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Enter temperature:");
        double temperature = sc.nextDouble();
        double celsius, fahrenheit;
        switch (choice) {
            case 1:

                celsius = (5.0 / 9) * (temperature - 32);
                System.out.println("Celsius is " + celsius);
                break;
            case 2:
                fahrenheit = (9.0 / 5) * temperature + 32;
                System.out.println("Fahrenheit is " + fahrenheit);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
    }
}
