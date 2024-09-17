package ss7.bai_tap.bai_1;

import java.util.Random;

interface Resizeable {
    void resize(double percent);
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(5, 4);
        shapes[2] = new Square(5);
        Random rand = new Random();
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Area before resizing: " + shape.getArea());
            double percent = 1 + rand.nextInt(100);
            System.out.println("Resizing by: " + percent + "%");
            if (shape instanceof Resizeable) {
                Resizeable resizeable = (Resizeable) shape;
                resizeable.resize(percent);
            }
            System.out.println(shape.toString());
            System.out.println("Area after resizing: " + shape.getArea());
        }
    }
}
