
import java.util.Scanner;

public class SaVolPerinCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of one side of the cube:");
        double a = sc.nextDouble();
        double sa = 6*(a*a);
        double vol = a*a*a;
        double peri =12*a;
        System.out.println("Surface Area of the cube is: " + sa+"cm²");
        System.out.println("Volume of the cube is: " + vol+"cm³");    
        System.out.println("Perimeter of the cube is: " + peri+"cm");
        sc.close();
    }
    
}
