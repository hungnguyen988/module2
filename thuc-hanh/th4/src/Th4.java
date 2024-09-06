import java.util.Scanner;

public class Th4 {
    public static void main(String[] args) {
        Scanner value1 = new Scanner(System.in);
        System.out.println("nhập a :");
        float a = value1.nextFloat();
        Scanner value2 = new Scanner(System.in);
        System.out.println("nhập b :");
        float b = value2.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("phơng trình vô s nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            System.out.println("phơng trình có nghiệm là : " + (-b / a));
        }
    }
}
