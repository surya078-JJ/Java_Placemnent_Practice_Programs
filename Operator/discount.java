
import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        final double discount = 10.0;;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original price of the item:");
        double op = sc.nextDouble();
        double ds = (op*discount)/100;
        double fp = op - ds;
        System.out.println("The Final amount is: " + fp );

    }
    
}
