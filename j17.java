// 17. Find Even Sum of Fibonacci Series Till number N

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, b = 1, sum = 0;
        while (b <= n) {
            if (b % 2 == 0) sum += b;
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(sum);
    }
}
