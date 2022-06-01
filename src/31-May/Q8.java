import java.util.Scanner;

public class GreatestNum {

        public static void main(String args[])
        {
            int num1, num2, num3, greatest;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 3 Numbers ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();

            greatest = (num1 > num2) ? (num1 > num3? num1 : num3):(num2 > num3 ? num2:num3);


            System.out.println("Greatest number is " +greatest);
        }
    }

