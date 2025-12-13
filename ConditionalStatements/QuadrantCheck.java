import java.util.Scanner;

public class QuadrantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0)
            System.out.println("First Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("Second Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("Third Quadrant");
        else if (x > 0 && y < 0)
            System.out.println("Fourth Quadrant");
        else if (x == 0 && y == 0)
            System.out.println("Origin");
        else if (x == 0)
            System.out.println("On Y-axis");
        else
            System.out.println("On X-axis");

        sc.close();
    }
}
