package ss13.bbai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuoiLienTiepMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = scanner.nextLine();
        System.out.println("chuỗi sắp xếp dài nhất ");
        System.out.println(findLongestSubsequence(str));

}
public static String findLongestSubsequence(String str) {

        char[] charArray = str.toCharArray();
    String ascendSeries = "" + charArray[0];

    List<String> ascendSeriesList = new ArrayList<>();
    for (int i = 0; i < charArray.length - 1; i++) {
        if (charArray[i] < charArray[i + 1]) {
            ascendSeries += charArray[i + 1];
        } else {
            ascendSeriesList.add(ascendSeries);
            ascendSeries = "" + charArray[i + 1];
        }
        if (i == charArray.length - 2) {
            ascendSeriesList.add(ascendSeries);
        }

    }

    String maxAscendingSeries = ascendSeriesList.get(0);

    for (String ascendSeri: ascendSeriesList) {
        if (ascendSeri.length() > maxAscendingSeries.length()) {
            maxAscendingSeries = ascendSeri;
        }
    }
    return maxAscendingSeries;
}}

