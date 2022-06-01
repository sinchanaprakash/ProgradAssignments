import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        int num,num1,num2,num3,reverse;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to be reversed");
        num=sc.nextInt();
        {
            num1 = num/100;
            num2 = (num%100)/10;
            num3 = num % 10;
            reverse = 100*num3 + 10*num2 + num1;
        }
        System.out.println("reverse number is " +reverse);
    }
}
