import java.util.Scanner;

public class Q37 {
    public static void main(String args[]) {
        int sum1=0,sum2=0,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
            while(num>0)
            {
                n=num%10;
                if (n%2==0)
                {
                    sum1= sum1+n;
                }
                else
                {
                    sum2=sum2+n;
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

