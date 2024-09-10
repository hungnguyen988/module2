package ss1.bai_tap;

import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền :");
        double soTien = input.nextDouble();
        double chuyenDoi = soTien * 23000;
        System.out.println("chuyển qua VND : " + chuyenDoi);
    }
}
