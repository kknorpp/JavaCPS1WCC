import java.util.Scanner;
public class averagewithScannerInput {
	public static void main(String [] args)	
	{
		
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println( " Please type three integers.");
		int number1 = keyboardInput.nextInt();
		int number2 = keyboardInput.nextInt();
		int number3 = keyboardInput.nextInt();
		int average = ( number1 + number2 + number3)/3;
		
		System.out.println( "The first number is " + number1);
		System.out.println( "The second number is " + number2);
		System.out.println( "The third number is " + number3);
		System.out.println( "The average of the three numbers is  " +average);
		
		
		
	}
}
