
import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of one side of the square:");
        double side= sc.nextDouble();
        double peri= 4*side;
        System.err.println("Perimeter of the square is: " + peri);
    }
    
}
