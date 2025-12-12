import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Hour");
	    int hrs = sc.nextInt();
	    System.out.printf("Mins");
	    int mins = sc.nextInt();
	    System.out.printf("Second");
	    int sec = sc.nextInt();
		System.out.printf("Current Time is : %02d:%02d:%02d",hrs,mins,sec);
	}
}