import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

       if((n & 1) == 0){
           System.out.println(n+" is Even number");
       }else{
           System.out.println(n+" is Odd number");
       }

    }
}