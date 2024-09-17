package ss6.bai_tap.point_movablepoint;

public class Point {
    protected float x;
    protected float y;

    // Constructor mặc định
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Constructor với tham số
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter và Setter cho x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter và Setter cho y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Phương thức thiết lập cả x và y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức lấy mảng tọa độ {x, y}
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
