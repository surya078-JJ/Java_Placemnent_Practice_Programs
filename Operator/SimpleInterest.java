
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, rate, time, simpleInterest;
        System.out.println("Enter the Principal Amount:");
        principal = sc.nextDouble();
        System.out.println("Enter the Rate of Interest:");
        rate = sc.nextDouble();
        System.out.println("Enter the Time Period:");
        time = sc.nextDouble();
        simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
        System.err.println("Final Amount is: " + (principal + simpleInterest));
    }
}