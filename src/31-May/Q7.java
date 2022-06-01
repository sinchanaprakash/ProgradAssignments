import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        int age;
        char ms, sex;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the driver");
        age = sc.nextInt();
        System.out.println("Enter the marital status of the driver \n M for married and U for unmarried");
        sex = sc.next().charAt(0);
        System.out.println("Enter the sex of the driver \n M for Male and F for Female");
        ms = sc.next().charAt(0);

        if (ms == 'M') {
            System.out.println("Driver is insured");
        }
        else if (ms == 'U' & age >= 30 && sex == 'M'){

            System.out.println("Driver is insured");
        }
        else if (ms == 'U' && age >= 25 && sex == 'F'){
            System.out.println("Driver is insured");
        }
        else{
            System.out.println("Driver is not insured");
        }

    }
}
