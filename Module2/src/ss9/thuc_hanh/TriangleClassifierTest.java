package ss9.thuc_hanh;

import java.util.Scanner;

public class TriangleClassifierTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides: ");
        double triangleEdgeOne =sc.nextDouble();
        System.out.println("Enter three sides: ");
        double triangleEdgeTwo =sc.nextDouble();
        System.out.println("Enter three sides: ");
        double triangleEdgeThree =sc.nextDouble();

        TriangleClassifier classifier = new TriangleClassifier();
        classifier.Triangle(triangleEdgeOne, triangleEdgeTwo, triangleEdgeThree);


    }


}
