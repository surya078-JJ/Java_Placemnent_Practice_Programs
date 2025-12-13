import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        int n2000 = amount / 2000;
        amount = amount % 2000;
        int n500 = amount / 500;
        amount = amount % 500;
        int n200 = amount / 200;
        amount = amount % 200;
        int n100 = amount / 100;
        amount = amount % 100;
        int n50 = amount / 50;
        amount = amount % 50;
        System.out.println("Currency Notes:");
        System.out.println("2000 = " + n2000);
        System.out.println("500  = " + n500);
        System.out.println("200  = " + n200);
        System.out.println("100  = " + n100);
        System.out.println("50   = " + n50);
    }
}