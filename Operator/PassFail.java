
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark : ");   
        int mark = sc.nextInt();
        String pf = (mark>50) ? "Pass" : "Fail";
        System.out.println("The Student is : " + pf);
        sc.close();
    }
}
