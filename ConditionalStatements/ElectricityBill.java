import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill = 0;

        if (units > 100)
            bill += Math.min(200, units - 100) * 5;

        if (units > 300)
            bill += (units - 300) * 10;

        if (units > 500)
            bill += bill * 0.10; // surcharge

        System.out.println("Electricity Bill = " + bill);
        sc.close();
    }
}
