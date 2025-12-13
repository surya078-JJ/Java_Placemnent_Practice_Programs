
import java.util.Scanner;

public class lastDigitDivisible3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int lastDigit = number % 10;

        if (lastDigit % 3 == 0) {
            System.out.println("The last digit of " + number + " is divisible by 3.");
        } else {
            System.out.println("The last digit of " + number + " is not divisible by 3.");
        }
    }
    
}
