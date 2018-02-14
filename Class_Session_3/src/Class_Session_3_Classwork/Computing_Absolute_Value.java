package Class_Session_3_Classwork;

import java.util.Scanner;

public class Computing_Absolute_Value {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.println("please enter a number to determine it's absolute value: ");
		int numberEntered = keyInput.nextInt();
	
		if (numberEntered < 0) {
		
			numberEntered = -numberEntered;

		}
		System.out.println("the absolute value is: " + numberEntered);
	}

}
