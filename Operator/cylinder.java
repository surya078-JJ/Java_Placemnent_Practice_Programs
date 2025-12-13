
import java.util.Scanner;

public class cylinder {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double h = sc.nextDouble();
        double sa = 2 * pi * r*(r +h);
        double vol = pi *(r*r)*h;
        System.out.printf("Surface Area of the cylinder is: %.2f %n", sa);
        System.out.printf("Volume of the cylinder is: %.2f %n", vol);   

    }
    
}
