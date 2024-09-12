package ss3.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhập độ dài mảng 1 : ");
            n = sc.nextInt();
        } while (n <= 0);
        int m;
        do {
            System.out.println("nhập độ dài mảng 2 : ");
            m = sc.nextInt();
        } while (m <= 0);
        int array1[] = new int[n];
        int array2[] = new int[m];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử vào mảng array " + (i + 1));
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.println("nhập phần tử vào mảng array2 " + (i + 1));
            array2[i] = sc.nextInt();
        }
        int array3[] = new int[n + m];
        System.arraycopy(array1, 0, array3, 0, n);
        System.arraycopy(array2, 0, array3, n, m);
        System.out.println("array3:");
        for (int i = 0; i < n + m; i++) {
            System.out.print(array3[i] + " ");
        }


    }
}
