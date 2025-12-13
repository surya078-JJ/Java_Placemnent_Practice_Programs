
import java.util.Scanner;

public class mangoOfferr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of to Buy : ");
        int mango = sc.nextInt();
        System.out.println("Cost of Mango : ");
        int cost = sc.nextInt();
        int total = mango * cost;
        int offer = mango/4;
        int toPay = (mango - offer )*cost;
        System.out.println("The Total Amount to Pay : "+toPay);
    }
    
}
