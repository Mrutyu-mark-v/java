// 20. Find the Perimeter of a Rectangle

import java.util.Scanner;

public class j20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble(), breadth = sc.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}