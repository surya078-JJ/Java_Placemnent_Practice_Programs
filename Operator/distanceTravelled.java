
import java.util.Scanner;

public class distanceTravelled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Speed : ");
        double speed = sc.nextDouble();
        System.out.println("Enter the Time in hrs : ");
        double time = sc.nextDouble();
        System.out.println("the Distance You Travlled is " + (speed * time) + "Km");
    }
    
}
