import java.util.Scanner;

public class Q17 {
        public static void main(String args[]){
            int num,rem,sum=0,tmp;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number");
            num = in.nextInt();
            tmp=num;
            while(tmp>0){
                rem=tmp%10;
                sum=(sum*10)+rem;
                tmp=tmp/10;
            }
            if(num==sum)
                System.out.println("It is a palindrome number ");
            else
                System.out.println("It is not a palindrome");
        }
    }
