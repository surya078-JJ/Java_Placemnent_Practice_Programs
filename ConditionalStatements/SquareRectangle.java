import java.util.Scanner;

public class SquareRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        if (l == b) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }

        sc.close();
    }
}
