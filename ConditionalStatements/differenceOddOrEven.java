
import java.util.Scanner;

public class differenceOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num1 = sc.nextInt();
        System.out.println("Please enter another number:");
        int num2 = sc.nextInt();
        int difference = num1 - num2;

        if (difference % 2 == 0) {
            System.out.println("The Difference of number " + difference + " is even.");
        } else {
            System.out.println("The Difference of number " + difference + " is odd.");
        }
        sc.close();
    }
    
}
