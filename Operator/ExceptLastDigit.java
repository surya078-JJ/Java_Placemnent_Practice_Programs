import java.util.Scanner;

public class ExceptLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Except Last Digits is "+ a/10);
        sc.close();
    }
    
}
