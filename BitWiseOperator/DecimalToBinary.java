import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        String result = "";

        while (n != 0) {
            int lastBit = n & 1;
            result = lastBit + result;
            n = n >> 1;
        }

        System.out.println(result);
    }
}
