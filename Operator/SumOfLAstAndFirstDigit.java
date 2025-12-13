import java.util.Scanner;

public class SumOfLAstAndFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int l=a%10;
         int f=a/100;
        System.out.printf("Sum Of Last And First Digit %d",f+l);
        sc.close();
    }    
}
