package ss6.bai_tap.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        // Kiểm thử Point2D
        Point2d point2D = new Point2d(1.5f, 2.5f);
        System.out.println("Point2D: " + point2D.toString());

        // Kiểm thử Point3D
        Point3d point3d = new Point3d(1.5f, 2.5f, 3.5f);
        System.out.println("Point3D: " + point3d.toString());

        // Thay đổi giá trị và kiểm thử lại
        point3d.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Updated Point3D: " + point3d.toString());
    }
}
