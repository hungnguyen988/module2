package ss9.thuc_hanh;

public class TriangleClassifier {
    public double triangleEdgeOne;
    public double triangleEdgeTwo;
    public double triangleEdgeThree;

    public TriangleClassifier() {};
    public TriangleClassifier(double triangleEdgeOne, double triangleEdgeTwo, double triangleEdgeThree){
        this.triangleEdgeOne = triangleEdgeOne;
        this.triangleEdgeTwo = triangleEdgeTwo;
        this.triangleEdgeThree = triangleEdgeThree;
    }
    public void Triangle(double triangleEdgeOne, double triangleEdgeTwo, double triangleEdgeThree) {
        if (triangleEdgeOne>0 && triangleEdgeTwo>0 && triangleEdgeThree>0 ) {
            if ((triangleEdgeOne+triangleEdgeTwo)>triangleEdgeThree && triangleEdgeOne +triangleEdgeThree>triangleEdgeTwo&& triangleEdgeThree +triangleEdgeTwo>triangleEdgeOne) {
                if (triangleEdgeOne == triangleEdgeTwo && triangleEdgeThree == triangleEdgeOne) {
                    System.out.println("Triangle is equilateral triangle");
                }else if (triangleEdgeOne == triangleEdgeTwo || triangleEdgeTwo == triangleEdgeThree || triangleEdgeThree == triangleEdgeOne) {
                    System.out.println("Triangle is isosceles triangle");
                } else {
                    System.out.println("triangle is regular triangle");

                }
            } else {
                System.out.println("triangle is not triangle");
            }
        }
    }
}
