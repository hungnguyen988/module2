package ss1.bai_tap;

import java.util.Scanner;

public class Bai3_DocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("mời nhập số: ");
        Scanner input = new Scanner(System.in);
        int giaTri = input.nextInt();
        String hangChuc = "";
        String hangDonVi = "";
        String hangTram = "";

        if (giaTri >= 0 && giaTri <= 20) {
            switch (giaTri) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;
            }
        }

        switch ((giaTri % 100) / 10) {

            case 2:
                hangChuc = "twenty";
                break;
            case 3:
                hangChuc = "thirty";
                break;
            case 4:
                hangChuc = "forty";
                break;
            case 5:
                hangChuc = "fifty";
                break;
            case 6:
                hangChuc = "sixty";
                break;
            case 7:
                hangChuc = "seventy";
                break;
            case 8:
                hangChuc = "eighty";
                break;
            case 9:
                hangChuc = "ninety";
                break;
        }
        switch (giaTri % 10) {
            case 0:
                hangDonVi = "";
                break;
            case 1:
                hangDonVi = "one";
                break;
            case 2:
                hangDonVi = "two";
                break;
            case 3:
                hangDonVi = "three";
                break;
            case 4:
                hangDonVi = "four";
                break;
            case 5:
                hangDonVi = "five";
                break;
            case 6:
                hangDonVi = "six";
                break;
            case 7:
                hangDonVi = "seven";
                break;
            case 8:
                hangDonVi = "eight";
                break;
            case 9:
                hangDonVi = "nine";
                break;
        }

        switch (giaTri / 100) {
            case 0:
                hangTram = "";
                break;
            case 1:
                hangTram = "one";
                break;
            case 2:
                hangTram = "two";
                break;
            case 3:
                hangTram = "three";
                break;
            case 4:
                hangTram = "four";
                break;
            case 5:
                hangTram = "five";
                break;
            case 6:
                hangTram = "six";
                break;
            case 7:
                hangTram = "seven";
                break;
            case 8:
                hangTram = "eight";
                break;
            case 9:
                hangTram = "nine";
                break;
        }

        if (giaTri < 100 && giaTri > 20) {
            System.out.println(hangChuc + " " + hangDonVi);
        } else if (giaTri < 1000) {
            System.out.println(hangTram + " hundred and " + hangChuc + " " + hangDonVi);
        }
    }

}
