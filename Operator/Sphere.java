
import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        double r = sc.nextDouble();
        double sa  = 4 * pi *(r*r);
        double vol = 4.0/3.0 * pi * (r*r*r);
        System.out.printf("Surface Area of the sphere is: %.2f %n", sa);
        System.out.printf("Volume of the sphere is: %.2f %n", vol);
        sc.close();
    }
    
}
