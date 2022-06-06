import java.util.Scanner;

public class Q15 {
    public static void main(String args[]){
        int i,factorial=1;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        num = sc.nextInt();
        for(i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+num+" is: "+factorial);
    }
}
