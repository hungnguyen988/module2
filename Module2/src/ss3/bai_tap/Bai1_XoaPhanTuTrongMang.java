package ss3.bai_tap;

import java.util.Scanner;

public class Bai1_XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int array[] = {1, 4, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần tìm");
        int number = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                flag = true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
        if (flag) {
            System.out.println("mảng chuyển thành :");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("số không có trong mảng");
        }
    }
}
