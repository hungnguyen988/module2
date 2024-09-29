package ss15;


import java.util.Scanner;

public class CheckTriangle {

    public static class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckTriangle checkTriangle = new CheckTriangle();
        while (true) {
            try {
                System.out.println("nhập cạnh 1: ");
                double side1 = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập cạnh 2: ");
                double side2 = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập cạnh 3: ");
                double side3 = Double.parseDouble(scanner.nextLine());
                checkTriangle.validateTriangle(side1, side2, side3);
                System.out.println("The given sides form a valid triangle");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    public void validateTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Sides must be greater than 0");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Not a valid triangle");
        }
    }
}
