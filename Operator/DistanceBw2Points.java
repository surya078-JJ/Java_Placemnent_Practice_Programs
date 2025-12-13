
import java.util.Scanner;

public class DistanceBw2Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of first point (x1 y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter coordinates of Seconf Point (x2,y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double Dis = Math.sqrt((x1-x2)*(x1-x2) +(y2-y1)*(y2-y1));
        System.out.println("Distance between the two points: " + Dis);
    }
    
}
