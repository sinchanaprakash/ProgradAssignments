import java.util.Scanner;

public class Q4 {
    public static void main(String args[]){
        int num1,num2,num3,num,reverse=0,first,last,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        num=sc.nextInt();
        {
            last = num % 10;
            first = num / 1000;
            sum = first + last;
        }
        System.out.println("Sum is " +sum);
    }
}
