package ss3.bai_tap;

import java.util.Scanner;

public class Bai6_Tong1Cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, x, min;
        min = 0;
        do {
            System.out.println("nhập độ dài mảng ");
            n = sc.nextInt();
        } while (n <= 0);
        double array[][] = new double[n][];
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("nhập độ dài mảng " + (i + 1));
                m = sc.nextInt();
            } while (m <= 0);
            min = m;
            if (min < m) {
                min = m;
            }
            array[i] = new double[m];
            for (int j = 0; j < m; j++) {
                System.out.println("nhập phần tử thứ " + (j + 1) + " vào mảng " + (i + 1));
                array[i][j] = sc.nextDouble();
            }
        }
        do {
            System.out.println("nhập số cột mốn tính tổng");
            x = sc.nextInt();
        } while (x >= min);
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i][x];
        }
        System.out.println("tổng là : " + sum);
    }
}
