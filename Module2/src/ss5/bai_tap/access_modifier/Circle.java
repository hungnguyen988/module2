package ss5.bai_tap.access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "red";



    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
