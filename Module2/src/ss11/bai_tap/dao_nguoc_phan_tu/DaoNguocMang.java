package ss11.bai_tap.dao_nguoc_phan_tu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DaoNguocMang {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        Stack<Integer> list = new Stack<>();
        Stack<Integer> list2 = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            list.push(array[i]);

        }
        System.out.println(list);

        for (int i = 0; i < array.length; i++) {
            array[i]=list.pop();
            list2.push(array[i]);
        }
        System.out.println(list2);


    }
}
