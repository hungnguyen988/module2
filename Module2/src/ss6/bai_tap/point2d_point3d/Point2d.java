package ss6.bai_tap.point2d_point3d;

public class Point2d {
    protected float x;
    protected float y;

    public Point2d() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
