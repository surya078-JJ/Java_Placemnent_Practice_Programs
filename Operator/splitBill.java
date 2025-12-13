
import java.util.Scanner;

public class splitBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total bill amount:");
        double totbill = sc.nextDouble();
        double noPer = 3.0;
        System.out.println("Amount for per person is " + (totbill/noPer));
    }
    
}
