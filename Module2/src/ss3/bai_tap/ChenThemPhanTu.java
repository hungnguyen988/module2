package ss3.bai_tap;

import java.util.Scanner;

public class ChenThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        System.out.println("nhập phần tử cần chèn:");
        double input = sc.nextDouble();
        byte index;
        do {
            System.out.println("nhập vị trí cần chèn:");
            index = sc.nextByte();
        } while (index < 0 || index > 10);

//        * theo hướng giảm dần
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = input;
//        *theo hướng tăng dần :
//        double x,y;
//        y = array[index];
//        array[index]= input;
//        for (int i = index+1; i<array.length;i++){
//            x=array[i];
//            array[i]=y;
//            y=x;
//        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
