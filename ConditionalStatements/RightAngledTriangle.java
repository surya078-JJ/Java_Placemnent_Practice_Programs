import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a*a + b*b == c*c ||
            b*b + c*c == a*a ||
            a*a + c*c == b*b) {
            System.out.println("Right-Angled Triangle");
        } else {
            System.out.println("Not a Right-Angled Triangle");
        }

        sc.close();
    }
}
