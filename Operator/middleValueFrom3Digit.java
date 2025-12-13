
import java.util.Scanner;

public class middleValueFrom3Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res =(a/10)%10;
        System.out.printf("Middle Value %d",res);
        sc.close();
    }
    
}
