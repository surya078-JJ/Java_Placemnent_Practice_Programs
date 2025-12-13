
import java.util.Scanner;

public class ThreedigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number >= 100 && number <= 999) {
            System.out.println(number + " is a three-digit number.");
        } else {
            System.out.println(number + " is not a three-digit number.");
        }
    }
    
}
