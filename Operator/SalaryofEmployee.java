import java.util.Scanner;

public class SalaryofEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter Allowance: ");
        double Allowance = sc.nextDouble();
        System.out.println("Gross Salary : " + (basic+Allowance));

        sc.close();
    }
}
