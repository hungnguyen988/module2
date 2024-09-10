package ss2.bai_tap;

public class Bai2 {
    public static void main(String[] args) {
        int count = 0;

        int prime = 2;
        while (count < 20) {
            boolean flag = true;
            for (int i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println(prime);
            }
            prime++;
        }
    }
}
