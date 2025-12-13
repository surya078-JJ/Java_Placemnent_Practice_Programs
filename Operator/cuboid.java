
import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the cuboid:");
        double len = sc.nextDouble();
        System.out.println("Enter the breadth of the cuboid:");
        double bre = sc.nextDouble();
        System.out.println("Enter the height of the cuboid:");
        double hei = sc.nextDouble();
        double sa = 2*((len*bre) + (bre*hei) + (len*hei));
        double vol = len * bre * hei;
        System.out.println("Surface Area of the cuboid is: " + sa + "cm²");
        System.out.println("Volume of the cuboid is: " + vol + "cm³");
        sc.close();
    }
    
}
