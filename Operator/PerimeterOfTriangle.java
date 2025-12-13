
import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side 1 of the triangle:");
        double side1 = sc.nextDouble();
        System.out.println("Enter the length of side 2 of the triangle:");
        double side2 = sc.nextDouble();
        System.out.println("Enter the length of side 3 of the triangle:");
        double side3 = sc.nextDouble();
        double peri = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle is: " + peri);
    }
    
}
