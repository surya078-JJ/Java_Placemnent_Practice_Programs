import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter S/o ");
	    String so = sc.nextLine();
	    System.out.printf("Enter door no. ");
	    String dn = sc.nextLine();
	    System.out.printf("Enter State ");
	    String state = sc.nextLine();
	    System.out.printf("Enter District ");
	    String dis = sc.nextLine();
	    System.out.printf("Enter Post ");
	    String post = sc.nextLine();
		System.out.printf("Address is : \n%s\n%s\n%s\n%s\n%s\n",so,dn,state,dis,post);
	}
}