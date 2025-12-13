
import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double len = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double bre = sc.nextDouble();
        double peri= 2 * (len + bre);
        System.out.println("Perimeter of the rectangle is: " + peri);

    }
    
}
