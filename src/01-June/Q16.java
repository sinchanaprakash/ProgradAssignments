import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        int num, tmp, cube = 0, count = 0;
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num = in.nextInt();
        tmp = num;
        String str = Integer.toString(num);
        int size = str.length();
        while (tmp > 0) {
            cube = tmp % 10;
            sum = (int) (sum + Math.pow(cube, size));
            tmp = tmp / 10;
        }
        if (sum == num) {
            System.out.println(+num+ " " + "is an armstrong number");
        } else {
            System.out.println(+num+ " " + "is not an armstrong number");
        }
    }
}
