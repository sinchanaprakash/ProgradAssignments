import java.util.Scanner;

public class Q18 {
    public static void main(String[] args){
    int num,i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num = in.nextInt();
    for (i=2;i<num;i++) {
        while (num%i==0) {
            System.out.println(i);
            num=num/i;
        }
    }
    if(num>2){
        System.out.println(num);
    }
    }
}
