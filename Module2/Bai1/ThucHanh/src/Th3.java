import java.util.Scanner;

public class Th3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        float width = a.nextFloat();
        Scanner b = new Scanner(System.in);
        System.out.println("nhập chiều rộng");
        float height = b.nextFloat();
        float acreage = width * height;
        System.out.println("diện tích : " + acreage);

    }
}