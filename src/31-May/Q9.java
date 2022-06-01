 import java.util.Scanner;

 public class Q9{

     public static void main(String args[])
     {
         double price, quantity, discount, total;

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Price and Number of quntity ");
         price = sc.nextInt();
         quantity = sc.nextInt();

         if(quantity>=10) {
             discount = 0.1 * price;
             total = (price*quantity) - discount;
         }
         else {
             total = price*quantity;
         }
         System.out.println("The price of the product :" +total);
     }
}
