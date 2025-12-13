
import java.util.Scanner;

public class PowerOf2InBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        int res = (a>0) && (a & (a-1)) == 0 ? 1 : 0;
        System.out.println("Is Power of 2 in Binary : " + res); 
        sc.close();
    }
    
}
