// 13. Check Armstrong Number between Two Integers

import java.util.Scanner;

public class j13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(), end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int num = i, sum = 0, digits = 0;
            while (num != 0) {
                digits++;
                num /= 10;
            }
            num = i;
            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, digits);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}