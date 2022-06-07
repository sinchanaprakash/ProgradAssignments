import java.util.Scanner;

public class Q20 {
    public static void main(String args[]) {
        int year, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year ");
        year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(+year+ " " + "is a leap year");
        } else {
            System.out.println(+year+ " " + "is not a leap year");
        }
    }
}
