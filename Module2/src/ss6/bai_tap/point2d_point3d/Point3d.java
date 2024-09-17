package ss6.bai_tap.point2d_point3d;

public class Point3d extends Point2d {
    private float z;

    // Constructor mặc định
    public Point3d() {
        super();
        this.z = 0.0f;
    }

    // Constructor với tham số
    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // Getter và Setter cho z
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // Phương thức thiết lập x, y, z
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    // Phương thức lấy mảng tọa độ {x, y, z}
    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
