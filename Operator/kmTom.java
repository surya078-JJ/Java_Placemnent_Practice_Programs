
import java.util.Scanner;

public class kmTom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers:");
        double km = sc.nextDouble();
        double m = km * 1000;
        System.err.println(km  +"Km is equal to "+ m + "m");
    }
    
}
