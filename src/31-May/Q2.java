import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {
        float p,r= 7.5F,t,SI,TotalAmount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal");
        p=sc.nextFloat();
        System.out.print("Enter the Time");
        t=sc.nextFloat();
        SI=(p*r*t)/100;
        TotalAmount=p+SI;
        System.out.print("Simple interest is " +SI);
        System.out.print("\nFinal amount paid to the bank is " +TotalAmount);
    }
}
