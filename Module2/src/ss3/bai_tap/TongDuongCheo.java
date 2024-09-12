package ss3.bai_tap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhập độ dài mảng");
            n = sc.nextInt();
        } while (n <= 0);
        double array[][] = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhập phần tử hàng " + i + " cột " + j);
                array[i][j] = sc.nextDouble();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i][i];
        }
        System.out.println("kết quả là : " + sum);
    }
}
