import java.util.Scanner;

public class TicketByDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday"))
            System.out.println("Weekend Price");
        else
            System.out.println("Weekday Price");

        sc.close();
    }
}
