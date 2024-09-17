package ss6.bai_tap.point_movablepoint;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Point
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point.toString());

        // Tạo đối tượng MovablePoint
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("Before move: " + movablePoint.toString());

        // Di chuyển điểm
        movablePoint.move();
        System.out.println("After move: " + movablePoint.toString());
    }
}
