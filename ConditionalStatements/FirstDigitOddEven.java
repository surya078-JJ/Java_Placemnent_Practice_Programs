import java.util.Scanner;

public class FirstDigitOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int firstDigit = Math.abs(num) / 100; // handles negative numbers

        if (firstDigit % 2 == 0)
            System.out.println("First digit is Even");
        else
            System.out.println("First digit is Odd");

        sc.close();
    }
}
