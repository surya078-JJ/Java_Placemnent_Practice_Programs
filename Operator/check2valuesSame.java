import java.util.Scanner;
public class check2valuesSame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String res =(a==b)?"true":"false";
        System.out.println(res);
        sc.close();
    }
}
