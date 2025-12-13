import java.util.Scanner;

public class bytesToBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bytes :");
        int byt = sc.nextInt();
        int bit = byt * 8;
        System.err.println(byt  +" is equal to "+ bit + "m");
    }
    
}
