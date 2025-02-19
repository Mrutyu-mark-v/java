
// 5. Add Two Binary Strings

public class j5 {
    public static void main(String[] args) {
        String bin1 = "1101";
        String bin2 = "1011";
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        System.out.println("Sum: " + Integer.toBinaryString(sum));
    }
}