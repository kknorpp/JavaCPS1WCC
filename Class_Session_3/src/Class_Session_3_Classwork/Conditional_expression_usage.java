package Class_Session_3_Classwork;
import java.util.Scanner;
public class Conditional_expression_usage {
	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.println("Enter two numbers.");
		
		int var1 = keyInput.nextInt();
		int var2 = keyInput.nextInt();
		
		
		
		 int largerInput = (var1 > var2) ? var1 : var2;
		System.out.println("The larger number was " + largerInput);
		
	}

}
