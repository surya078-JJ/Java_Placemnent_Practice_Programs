
import java.util.Scanner;

public class productIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");  
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        int product = num1 * num2;

        if (product > 0) {
            System.out.println("The product is positive.");
        } else if (product < 0) {
            System.out.println("The product is negative.");
        } else {
            System.out.println("The product is zero.");
        }
    }
    
}
