import java.text.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Self_Service_Checkout_Line {

		public static void main(String[] args) {
			
			Scanner keyInput = new Scanner(System.in);
			
			
			System.out.println( "Enter Number of items purchased");
			System.out.println("Followed by the cost of one item.");
			System.out.println( "Do not use a dollar sign.");
			int item1 = keyInput.nextInt();
			double price1 = keyInput.nextDouble();
			double totalPrice = item1*price1;
			System.out.printf("%d items at $%4.2f each. ", item1,	price1);
			System.out.printf("Total amount due $%6.2f",  totalPrice);
			System.out.println("Place "
			
		}
}
