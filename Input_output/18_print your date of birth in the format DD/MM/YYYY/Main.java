import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int date = sc.nextInt();
	    int month = sc.nextInt();
	    int year = sc.nextInt();
		System.out.printf("Date of Birth is : %02d/%02d/%d",date,month,year);
	}
}