import java.util.Scanner;

public class AverageOf3Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B Value : ");
        int b = sc.nextInt();
        System.out.println("Enter C Value : ");
        int c = sc.nextInt();
        int res =(a+b+c)/3;
        System.out.println("Average of Three no. is : "+res);
        sc.close();
    }    
}
