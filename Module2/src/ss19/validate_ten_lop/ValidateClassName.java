package ss19.validate_ten_lop;

import java.util.Scanner;

public class ValidateClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên lớp");
        String name = scanner.nextLine();
        if (ClassName.validate(name)) {
            System.out.println("Tên lớp hợp lệ");
        } else {
            System.out.println("Tên lớp không hợp lệ");
        }
    }
}
