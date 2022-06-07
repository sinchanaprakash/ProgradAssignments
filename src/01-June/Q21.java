import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        int first, last,rem;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number");
        first =sc.nextInt();
        System.out.print("Enter the last number");
        last=sc.nextInt();

        for(int num = first + 1; num < last; ++num) {
            int digits = 0;
            int result = 0;
            int tmp = num;

            while (tmp != 0) {
                tmp /= 10;
                ++digits;
            }

            tmp = num;

            while (tmp != 0) {
                rem = tmp % 10;
                result += Math.pow(rem, digits);
                tmp /= 10;
            }

            if (result == num) {
                System.out.print(num + " ");
            }
        }
    }
}

