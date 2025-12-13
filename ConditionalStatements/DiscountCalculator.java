import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();
        double discount;

        if (bill >= 5000)
            discount = bill * 0.20;
        else if (bill >= 2000)
            discount = bill * 0.10;
        else
            discount = bill * 0.05;

        System.out.println("Final Amount = " + (bill - discount));
        sc.close();
    }
}
