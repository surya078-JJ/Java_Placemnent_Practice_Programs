
import java.util.Scanner;

public class AreaofTringle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double res = 0.5*(b*h);
        System.out.println("area of triangle is : "+res);
        sc.close();
    }
    
}
