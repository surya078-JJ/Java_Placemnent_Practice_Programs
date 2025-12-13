
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double  pi =3.14;
        Scanner sc =new Scanner(System.in);
        double r = sc.nextDouble();
        double res = pi*(r*r);
        System.err.println("Area Of Circle :"+res);
    }
    
}
