import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters = sc.nextInt();
        double bill = 0;

        if (liters > 1000)
            bill += Math.min(2000, liters - 1000) / 1000.0 * 5;

        if (liters > 3000)
            bill += (liters - 3000) / 1000.0 * 10;

        System.out.println("Water Bill = " + bill);
        sc.close();
    }
}
