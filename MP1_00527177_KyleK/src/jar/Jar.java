package jar;
import java.util.Scanner;
public class Jar {

	
	public static void main(String[] args) {
		
		
		Scanner keyInput = new Scanner(System.in);
		
		System.out.print("Enter the number of Quarters in your Jar:");
		int Quarters = keyInput.nextInt();
		System.out.print("Enter the number of Dimes in your Jar:");
		int Dimes = keyInput.nextInt();
		System.out.print("Enter the numer of Nickels in your Jar:");
		int Nickels = keyInput.nextInt();
		System.out.print("Enter the number of Pennies in your Jar:");
		int Pennies = keyInput.nextInt();

		
		
		
		
		
	System.out.println("The Jar contains " + (Quarters*25 + (Dimes*10)+ (Nickels*5)+ (Pennies)+ " cents."));
	
	}	
}
