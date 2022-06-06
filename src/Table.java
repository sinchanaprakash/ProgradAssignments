import java.util.Scanner;

public class Table {
        static void multiplication_table(int N, int i)
        {
            if (i > 10)
                return ;

            System.out.println(N + " * " + i + " = " + N * i);
            multiplication_table(N, i+1);
        }

        public static void main (String[] args)
        {
            int N;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number ");
            N = sc.nextInt();
            multiplication_table(N, 1);
        }

    }
