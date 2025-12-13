
import java.util.Scanner;

public class firstdigitOddOrEvenFrom3Digitno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three-digit number:");
        int number = sc.nextInt();
        int fd = number / 100; 
        if (fd % 2 == 0) {
            System.out.println("The first digit " + fd + " is even.");
        } else {
            System.out.println("The first digit " + fd + " is odd.");
        }
    }
    
}
