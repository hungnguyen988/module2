package ss4.bai_tap.bai_1_giai_phuong_trinh;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập a");
        double a = input.nextDouble();
        System.out.println("nhập b");
        double b = input.nextDouble();
        System.out.println("nhập c");
        double c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("phương trình có 2 nghiệm :" + equation.getRoot1() + " " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("phương trình có nghiệm kép " + equation.getRoot1());
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
