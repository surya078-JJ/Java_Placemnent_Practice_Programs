import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next(); 
            switch (color) {
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Ready");
            case "green" -> System.out.println("Go");
            default -> System.out.println("Invalid Color");
        }
        sc.close();
    }
}
