import java.util.Scanner;

public class AsciiEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        if (ascii % 2 == 0) {
            System.out.println("ASCII value of '" + ch + "' is " + ascii + " (Even)");
        } else {
            System.out.println("ASCII value of '" + ch + "' is " + ascii + " (Odd)");
        }

        sc.close();
    }
}
