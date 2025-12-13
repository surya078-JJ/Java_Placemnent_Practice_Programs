
import java.util.Scanner;

public class minsToSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minutes:");
        int mins = sc.nextInt();
        int sec = mins * 60;
        System.out.println(mins + " minutes is " + sec + " sec.");
    }
    
}
