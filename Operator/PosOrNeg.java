
import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        String res = (a>=0) ? "Positive" : "Negative";
        System.out.println("The Number is : " + res);       
        sc.close();
    }
}
