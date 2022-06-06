import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:\n");

        int x = in.nextInt(),
                sum = 0,m;
        System.out.print ("The sum of " + x + " digits is = ");

        while (x > 0) {
            m = x%10;
            sum = sum+m;
            x = x/10;
        }
        System.out.println (sum + "\n");
    }

}
