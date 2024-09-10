package ss3.bai_tap;

import java.util.Scanner;

public class Bai5_TimMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhập độ dài mảng");
            n = sc.nextInt();
        } while (n <= 0);
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
    }
}
