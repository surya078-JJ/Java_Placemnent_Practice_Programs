
import java.util.Scanner;

public class sameLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");  
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        if (num1 % 10 == num2 % 10) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
    
}
