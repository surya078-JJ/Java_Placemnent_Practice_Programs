import java.util.Scanner;

public class PurchaseDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        if (amount >= 3000)
            amount *= 0.80;
        else if (amount >= 1500)
            amount *= 0.90;

        System.out.println("Payable Amount = " + amount);
        sc.close();
    }
}
