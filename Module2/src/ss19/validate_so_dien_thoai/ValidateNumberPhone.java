package ss19.validate_so_dien_thoai;

import java.util.Scanner;

public class ValidateNumberPhone {
    public static void main(String[] args) {
        NumberPhone numberPhone = new NumberPhone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điện thoại ");
        String number = scanner.nextLine();
        if (NumberPhone.validate(number)) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
