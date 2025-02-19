// 10. Find GCD or HCF of 2 numbers

import java.util.Scanner;

public class j10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("GCD/HCF: " + a);
    }
}