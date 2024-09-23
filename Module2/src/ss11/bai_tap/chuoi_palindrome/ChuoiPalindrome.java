package ss11.bai_tap.chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ChuoiPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chuỗi:");
        String string = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        boolean isPalindrome = true;
        for (char character : string.toCharArray()) {
            stack.push(character);
            queue.offer(character);
        }
        for (int i = 0; i < string.length(); i++) {
            stack1.push(stack.pop());
            if (stack1.get(i) != queue.poll()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("đây là chuỗi palindrome");
        } else {
            System.out.println("đây k phải là chuỗi palindrome");
        }


    }

}
