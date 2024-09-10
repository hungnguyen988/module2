import java.util.Scanner;

public class Th5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập tháng :");
        byte month = input.nextByte();
        switch (month) {
            case 2:
                System.out.println("tháng " + month + " có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng " + month + " có 31 ngày");
                break;
            default:
                System.out.println("tháng " + month + " có 30 ngày");
        }
    }
}
