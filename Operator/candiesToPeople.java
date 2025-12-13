import java.util.Scanner;

public class candiesToPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total no of  Candies : ");
        double candy = sc.nextDouble();
        System.out.println("Enter the no of Persons: ");
        double person = sc.nextDouble();
        System.out.println("Candies for Person " + (candy / person) + " Candies");
    }
    
}
