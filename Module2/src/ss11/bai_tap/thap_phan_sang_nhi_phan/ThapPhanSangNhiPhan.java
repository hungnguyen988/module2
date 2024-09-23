package ss11.bai_tap.thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần chuyển đổi");

        int input = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (input > 0) {
            stack.push(input % 2);
            input /= 2;
        }
        System.out.println(" chuyển qua hệ nhị phân : ");
        for (int i = stack.size(); i > 0; i--) {
            System.out.print((stack.pop()));
        }
    }
}
