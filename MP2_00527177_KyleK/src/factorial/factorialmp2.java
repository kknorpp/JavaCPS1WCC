package factorial;

import java.util.Scanner;

public class factorialmp2 {
	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		String response = "y";

		while (response.equals("y")) {
			System.out.println("Enter in N as an integer to see it\'s factorial.");

			int number;
			int i = 0;
			long factorial = 1;
			{

				number = keyInput.nextInt();
				for (i = 1; i <= number; i++) {
					factorial = (factorial * i);
				}
				i++;
			}
			System.out.println("Factorial = " + factorial);
			System.out.print("Do you want to continue? (y/n):");
			response = keyInput.next();
			System.out.println();
		}
		System.out.println("Have a good day!");
	}
}