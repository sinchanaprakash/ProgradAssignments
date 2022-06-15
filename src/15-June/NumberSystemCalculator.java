import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSystemCalculator {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("    Number System Conversion Calculator    \n");

        Scanner sc = new Scanner(System.in);
        int decimal = 0;
        int numsys1 = 0;
        int numsys2 = 0;
        boolean valid;

        do {
                try {
                    System.out.println("Choose the Number System you want to convert \n" +
                            "  1. Binary  \n" +
                            "  2. Decimal  \n" +
                            "  3. Octal  \n" +
                            "  4. Hexadecimal  \n");
                    numsys1 = sc.nextInt();
                    valid=true;
                    while (numsys1 > 4) {
                        System.out.println("Its invalid. Choose a proper number");
                        System.out.println(" \n  1. Binary  \n" +
                                "  2. Decimal  \n" +
                                "  3. Octal  \n" +
                                "  4. Hexadecimal  \n");
                        numsys1 = sc.nextInt();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Its invalid. You cannot enter an alphabet");
                    valid=false;
                    sc.next();
                }
            }while(!valid);

            sc.nextLine();
            System.out.println("   Enter the number you want to convert");
            String num = sc.nextLine();
            boolean result1=num.matches("[0-1]+");
            boolean result2=num.matches("[0-9]+");
            boolean result3=num.matches("[0-9]+");
            boolean result4=num.matches("[a-fA-F0-9]+");
        

            switch (numsys1) {

                case 1:
                    while(result1==false){
                        System.out.println("\n   The number is not of valid format");
                        System.out.println("         Enter the number again");
                        num = sc.nextLine();
                        result1=num.matches("[0-1]+");
                    }
                    decimal = Integer.parseInt(num, 2);
                    break;


                case 2:
                    while(result2==false){
                        System.out.println("\n   The number is not of valid format");
                        System.out.println("         Enter the number again");
                        num = sc.nextLine();
                        result2=num.matches("[0-9]+");
                    }
                    decimal = Integer.parseInt(num);
                    break;

                case 3:
                    while(result3==false){
                        System.out.println("\n   The number is not of valid format");
                        System.out.println("         Enter the number again");
                        num = sc.nextLine();
                        result3=num.matches("[0-9]+");
                    }
                    decimal = Integer.parseInt(num, 8);
                    break;

                case 4:
                    while(result4==false){
                        System.out.println("\n   The number is not of valid format");
                        System.out.println("         Enter the number again");
                        num = sc.nextLine();
                        result4=num.matches("[a-fA-F0-9]+");
                    }
                    decimal = Integer.parseInt(num, 16);
                    break;

                default:
                    break;
            }


        boolean value;
        do {
            try {
                System.out.println("Choose the Number System you want to convert \n" +
                        "  1. Binary  \n" +
                        "  2. Decimal  \n" +
                        "  3. Octal  \n" +
                        "  4. Hexadecimal  \n");
                numsys2 = sc.nextInt();
                value=true;
                while (numsys2 > 4) {
                    System.out.println("Its invalid. Choose a proper number");
                    System.out.println(" \n  1. Binary  \n" +
                            "  2. Decimal  \n" +
                            "  3. Octal  \n" +
                            "  4. Hexadecimal  \n");
                    numsys2 = sc.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("Its invalid. You cannot enter an alphabet");
                value=false;
                //sc.next();
            }
        }while(!value);


        String ConvertedNum = "";
        System.out.println(numsys2);

        switch (numsys2) {

            case 1:
                System.out.println("   Binary Number:" + " " + Integer.toBinaryString(decimal));
                break;
            case 2:
                System.out.println("   Decimal Number:" + " " + decimal);
                break;
            case 3:
                System.out.println("   Octal Number:" + "" + Integer.toOctalString(decimal));
                break;
            case 4:
                System.out.println("   Hexadecimal:" + " " + Integer.toHexString(decimal));
                break;
            default:
                break;

        }
            System.out.println(ConvertedNum);

    }
}
