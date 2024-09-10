package ss3.thuc_hanh;

import java.util.Scanner;

public class ThucHanh2 {
    public static void main(String[] args) {
        String students[] = {"a", "b", "c"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                flag = true;
                System.out.println("vị trí của " + name + " là " + i);
                break;
            }
        }
        if (!flag) {
            System.out.println(name + " không tìm thấy trong danh sách");
        }
    }
}
