import java.util.Scanner;

class Factor {

    Factor(int num) {
        factor(num);
    }

    void factor(int num) {
        for (int i = 1; i < num; ++i) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
        public class Factors
        {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number");
                int num = sc.nextInt();
                Factor obj=new Factor(num);
            }
        }

