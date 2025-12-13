import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = (a<0) ? -a : a;
        System.out.printf("Absolute Value %d",res);
        sc.close();
    }
    
}
