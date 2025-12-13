
import java.util.Scanner;

public class cakemade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Tray:");
        int tray = sc.nextInt();
        System.out.println("Enter the number of Cakes per Tray:");
        int cakePerTray = sc.nextInt();
        int totalCakes = tray * cakePerTray;
        System.out.println("Total number of Cakes made: " + totalCakes);
    }
    
}
