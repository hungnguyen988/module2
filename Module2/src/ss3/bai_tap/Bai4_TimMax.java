package ss3.bai_tap;

import java.util.Scanner;

public class Bai4_TimMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n, m;
        do {
            System.out.println("nhập độ daì mảng");
            n = sc.nextByte();
        } while (n <= 0);
        double array[][] = new double[n][];
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("nhập độ daì mảng " + (i + 1));
                m = sc.nextByte();
            } while (m <= 0);
            array[i] = new double[m];
            for (int j = 0; j < m; j++) {
                System.out.println("nhập phần tử thứ " + (j + 1) + " vào mảng " + (i + 1));
                array[i][j] = sc.nextDouble();
            }
        }
        int toaDoI, toaDoJ;
        double max;
        max = array[0][0];
        toaDoI = 0;
        toaDoJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    toaDoI = i + 1;
                    toaDoJ = j + 1;
                }
            }
        }
        System.out.println("số lớn nhất trong mảng là : " + max);
        System.out.println("số lớn nhất ở hàng : " + toaDoI);
        System.out.println("số lớn nhất ở cột : " + toaDoJ);
    }
}
