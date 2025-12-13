import java.util.Scanner;

public class DivsibleOnCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number % 3 == 0 && number % 7 == 0 &&  number % 8 != 0) {
            System.out.println(number + " is divisible by both 3 and 7 but not by 8.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 7 but not by 8.");
        }
    }
    
}
