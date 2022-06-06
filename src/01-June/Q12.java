import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        int first, last;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        first = sc.nextInt();
        System.out.println("Enter the last number");
        last = sc.next().charAt(0);

        while (first < last) {
            boolean flag = false;

            for(int i = 2; i <= first/2; ++i) {
                if(first % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && first != 0 && first != 1)
                System.out.print(first + " ");
            ++first;
        }
    }
}

