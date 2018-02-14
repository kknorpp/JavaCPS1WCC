package averager_problem;

import java.util.Scanner;

public class averager_problem_mp1 {

	public static void main(String[] args) {

		Scanner keyInput = new Scanner(System.in);

		System.out.println("Please enter three numbers.");

		float num1 = keyInput.nextFloat();
		float num2 = keyInput.nextFloat();
		float num3 = keyInput.nextFloat();
		float average = ((num1 + num2 + num3) / 3);

		System.out.printf("The average of your three inputs is %.2f ", average);

	}
}
