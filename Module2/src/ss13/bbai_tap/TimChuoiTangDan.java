package ss13.bbai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = scanner.nextLine();
        String subStr = "";
        List<String> charString = new ArrayList<>();


        for (int j = 0; j < str.length() - 1; j++) {
            subStr += str.charAt(j);
            char perviousChar = str.charAt(j);
            for (int i = j + 1; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (currentChar > perviousChar) {
                    subStr += currentChar;
                    perviousChar = currentChar;
                }
            }
            charString.add(subStr);
            subStr = "";
        }


        String maxSubStr = charString.get(0);
        for (String sub : charString) {
            if (sub.length() > maxSubStr.length()) {
                maxSubStr = sub;
            }
        }
        System.out.println("Chu��i có độ dài lớn nhất tăng dần: " + maxSubStr);
    }
}
