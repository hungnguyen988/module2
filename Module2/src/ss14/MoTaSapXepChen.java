package ss14;

import java.util.Arrays;

public class MoTaSapXepChen {
    public static void main(String[] args) {
        int[] array = {22,64, 34, 25, 12, 11, 90, 56, 15};
//        int[] array = {1,2,3,4};
        System.out.println("Danh sach truoc khi sap xep:");


        insertionSort(array);

        System.out.println("\nDanh sach sau khi sap xep:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


    }

    // Cài đặt phương thức sap xếp chèn
    public static void insertionSort(int[] array){
        int pos, x;

        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){

                array[pos] = array[pos-1];
                pos--;
//                System.out.println(Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println("bước " + i + Arrays.toString(array));


        }
    }
}
