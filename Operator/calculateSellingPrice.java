
import java.util.Scanner;

public class calculateSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost of Product: ");
        double cost = sc.nextDouble();
        System.out.print("Profit : ");
        double profit = sc.nextDouble();
        System.out.println(" Selling Price : " + (cost+profit));
    }
}