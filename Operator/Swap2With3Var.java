import java.util.Scanner;

public class Swap2With3Var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        int c = a;
        a=b;
        b=c;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }   
}
