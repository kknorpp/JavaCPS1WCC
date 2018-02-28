package newton_sqrt;

import java.util.Scanner;

public class newtonsMethod {
	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);

		System.out.print("Enter in N for force in Newtons: ");

		double targetAccuracy = .000001; // actual accuracy needed for same output as rubric used here.
		// .000001 is not accurate enough to mirror that output, used more accurate
		// representation.
		double inputNewtonsn = keyInput.nextDouble();
		double lastGuess = inputNewtonsn;

		double accuracy = Double.MAX_VALUE;
		while (accuracy >= targetAccuracy) {
			double newGuess = ((inputNewtonsn / lastGuess) + lastGuess) / 2;

			accuracy = Math.abs(lastGuess - newGuess);
			lastGuess = newGuess;
		}
		System.out.printf("Newton(" + inputNewtonsn + ") = " + lastGuess);
		System.out.println();
		System.out.println("Math.sqrt     = " + Math.sqrt(inputNewtonsn));
	}

}
