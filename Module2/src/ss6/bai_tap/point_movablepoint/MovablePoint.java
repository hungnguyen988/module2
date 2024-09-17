package ss6.bai_tap.point_movablepoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    // Constructor mặc định
    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Constructor với tham số (x, y, xSpeed, ySpeed)
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor với tham số (xSpeed, ySpeed)
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter và Setter cho xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter và Setter cho ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Phương thức thiết lập cả xSpeed và ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Phương thức lấy mảng tốc độ {xSpeed, ySpeed}
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Phương thức di chuyển điểm
    public MovablePoint move() {
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}