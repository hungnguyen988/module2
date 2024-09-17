package ss6.bai_tap.hinh_tron_hinh_tru;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "blue");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(3.5, "green", 5.0);
        System.out.println(cylinder.toString());
    }
}
