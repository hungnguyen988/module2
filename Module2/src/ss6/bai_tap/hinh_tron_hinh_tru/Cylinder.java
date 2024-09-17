package ss6.bai_tap.hinh_tron_hinh_tru;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;  // Sử dụng getArea() từ lớp cha
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
