package ss13.bbai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array =new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử vào mảng");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        System.out.println("nhập giá trị cần tìm");
        int value = Integer.parseInt(scanner.nextLine());

        binarySearch(array, 0, array.length - 1, value);

        if (binarySearch(array, 0, array.length - 1, value) == -1) {
            System.out.println("Không tìm thấy giá trị trong mảng");
        }else {
            System.out.println("Vị trí của giá trị trong mảng: " + binarySearch(array, 0, array.length - 1, value));
        }

    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

}
