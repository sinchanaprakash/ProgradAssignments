import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        double TA, DA, HRA, PF, bonus, gross, basic;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Basic Salary");
        basic=sc.nextDouble();
        {
            TA = 0.2 * basic;
            DA = 0.15 * basic;
            HRA = 0.20 * basic;
            PF = 0.12 * basic;
            if (basic>=20000)
            {
                bonus = 0.10 * basic;
            }
            else
            {
                bonus = 0.20 * basic;
            }
            gross = (basic + bonus + DA + TA + HRA - PF);
        }
        System.out.println("Sum is " +gross);
    }

}
