import java.util.Scanner;

public class SameLastDigitYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first year: ");
        int y1 = sc.nextInt();

        System.out.print("Enter second year: ");
        int y2 = sc.nextInt();

        if (y1 % 10 == y2 % 10) {
            System.out.println("Both years have the same last digit");
        } else {
            System.out.println("Last digits are different");
        }

        sc.close();
    }
}
