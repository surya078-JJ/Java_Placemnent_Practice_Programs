
import java.util.Scanner;

public class circumferenceofcircle {
    public static void main(String[] args) {
        final double pi =3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();;
        double cr =2*pi*r;
        System.out.printf("Circumference of the circle is: %2f",cr);
    }
    
}
