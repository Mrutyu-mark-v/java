
// 19. Calculate Compound Interest

import java.util.Scanner;

public class j19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;
        System.out.println("Compound Interest: " + ci);
    }
}
