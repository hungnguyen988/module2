package ss13.thuc_hanh;

public class DemSoPhanTu {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 1, 2, 4, 2, 1, 3, 5, 7};

        int count = 0;
        boolean alike = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && array[j] != 0) {
                    alike = true;
                    array[j] = 0; // Xóa phần tử giống nhau để ko đếm lại
                }
            }
            if (alike) {
                count++;
            }
            alike = false;
        }
        System.out.println("Số phần tử giống nhau: " + count);

    }
}
