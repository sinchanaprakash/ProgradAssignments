import java.util.Scanner;

public class Q37 {
    public static void main(String args[]) {
        int sum1=0, n1, sum2=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
            while(num>0)
            {
                n1=num%10;
                if (n1%2==0)
                {
                    sum1= sum1+n1;
                }
                else
                {
                    sum2=sum2+n1;
                }

                num=num/10;
            }

        if(sum1==sum2)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    }

