import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String num= sc.nextLine();
	    int a=Integer.parseInt(num,16);
	    System.out.println("Hexadecimal to Integer ");
		System.out.println(a);
	}
}