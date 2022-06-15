import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSystemCalculator {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("    Number System Conversion Calculator    \n");
        System.out.println("Choose the Number System you want to convert \n" +
                "  1. Binary  \n" +
                "  2. Decimal  \n" +
                "  3. Octal  \n" +
                "  4. Hexadecimal  \n");
        Scanner sc = new Scanner(System.in);
        int numsys1 = sc.nextInt();
        sc.nextLine();
        System.out.println("   Enter the number you want to convert");
        String num = sc.nextLine();
        System.out.println(num);
        int decimal=0;

        switch (numsys1) {

            case 1:
                decimal = Integer.parseInt(num, 2);
                break;
            case 2:
                decimal = Integer.parseInt(num);
                break;
            case 3:
                decimal = Integer.parseInt(num, 8);
                break;
            case 4:
                decimal = Integer.parseInt(num, 16);
                break;

            default:
                /*try {
                    numsys1 = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Number");
                }*/
        }

        System.out.println("  Enter the Number System to which you want to convert the number \n" +
                "   1. Binary  \n" +
                "   2. Decimal  \n" +
                "   3. Octal  \n" +
                "   4. Hexadecimal  \n");

        int numsys2 = sc.nextInt();
        String ConvertedNum="";

        int convertedNu = 0;


        switch (numsys2) {

            case 1:
                System.out.println("   Binary Number:" +" " +Integer.toBinaryString(decimal));

                break;
            case 2:
                System.out.println("   Decimal Number:" +" "  +decimal);
                break;
            case 3:
                System.out.println("   Octal Number:" +"" +Integer.toOctalString(decimal));
                break;
            case 4:
                System.out.println("   Hexadecimal:" +" " +Integer.toHexString(decimal));

                break;

            default:
                try {
                    numsys1 = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Number");
                }
                System.out.println(ConvertedNum);
        }

    }
}
