package ss3.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String input = sc.nextLine();
        System.out.println("nhập ký tự cần tìm");
        char character = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("số lần ký tự xuất hiện : " + count);
    }
}
