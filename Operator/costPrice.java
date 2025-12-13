import java.util.Scanner;

public class costPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Selling Cost of Product: ");
        double sell = sc.nextDouble();
        System.out.print("Loss : ");
        double loss = sc.nextDouble();
        System.out.println(" Cost of Buying : " + (sell+loss));
    }
    
}
