import java.util.Scanner;

public class Q10 {

        public static void main(String args[]) {

            int days,num,month;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of days");
            num = sc.nextInt();

            days = num % 30;
            month = num / 30;
            System.out.println( "Month and days = " + month + " Month and " + days + " days");
        }
    }

