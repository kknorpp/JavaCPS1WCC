import java.util.Scanner;
public class inputusingtheScannerClass {
	public static void main(String[] args)
	{
		Scanner keyboardInput = new Scanner(System.in);
		keyboardInput.useDelimiter("#");
		
		System.out.println("Please type in an integer:");
		double number1 = keyboardInput.nextInt();
		double number2 = keyboardInput.nextInt();
		System.out.println("Please type a sentence:");
		String junkLine = keyboardInput.nextLine();
		String string1 = keyboardInput.nextLine();
		System.out.println("First Number is : " + number1);	
		System.out.println("Second Number is : " + number2);
		System.out.println(string1);
	}
}
