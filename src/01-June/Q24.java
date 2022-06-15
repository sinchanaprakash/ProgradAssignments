import java.util.Scanner;

public class Q24 {
    static int power(int N, int P)
    {
        int pow = 1;
        for (int i = 1; i <= P; i++)
            pow *= N;
        return pow;
    }
    public static void main(String[] args)
    {
        int N,P;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number");
        N =sc.nextInt();
        System.out.print("Enter the Power");
        P=sc.nextInt();


        System.out.println(power(N, P));
    }
}
