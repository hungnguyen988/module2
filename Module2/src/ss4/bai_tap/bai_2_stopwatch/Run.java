package ss4.bai_tap.bai_2_stopwatch;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        int array[] = new int[500000];
        Random rand = new Random();
        for (int i = 0; i < 500000; i++) {
            array[i] = rand.nextInt(100);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();
        System.out.println("thời gian thực thi của thuật toán sắp xép : " + stopWatch.getElapsedTime());
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
