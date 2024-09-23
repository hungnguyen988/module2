package ss11.bai_tap.dem_phan_tu_dung_map;

import java.util.Scanner;
import java.util.TreeMap;

public class DemPhanTu {
    public static void main(String[] args) {
        TreeMap<String, Integer> wordMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào văn bản cần đếm từ:");
        String input = scanner.nextLine();


        String[] words = input.toLowerCase().split(" ");


        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println("Số lần xuất hiện của các từ trong văn bản:");
        for (String word : wordMap.keySet()) {
            System.out.println(word + ": " + wordMap.get(word));
        }

        scanner.close();
    }
}
