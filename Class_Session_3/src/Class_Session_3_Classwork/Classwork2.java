package Class_Session_3_Classwork;

import java.util.Scanner;

public class Classwork2{
	public static void maing(String[] args) {

		
		Scanner keyInput = new Scanner(System.in);
		
		int num1 = keyInput.nextInt();
		int num2 = keyInput.nextInt();
		
		System.out.println("Please enter two numbers.");
		
		if (num1 < num2) { 
			System.out.println("The larger number was entered second and is " + num2);
		}
		else { 
			System.out.println("The larger number was entered first and is " + num1);
		}
		
	}
}