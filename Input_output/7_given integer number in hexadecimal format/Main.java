import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num= sc.nextInt();
	    String a=Integer.toHexString(num);
	    System.out.println("Integer to Hexadecimal");
		System.out.println(a);
	}
}
