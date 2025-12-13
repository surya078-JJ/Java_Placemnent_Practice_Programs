import java.util.Scanner;

public class ATMpinCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        int storedPin = 1234;

        if (enteredPin == storedPin)
            System.out.println("PIN Matched. Access Granted");
        else
            System.out.println("Wrong PIN");

        sc.close();
    }
}
