import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num= sc.nextInt();
	    String a=Integer.toOctalString(num);
	    System.out.println("Integer to Octal");
		System.out.println(a);
	}
}