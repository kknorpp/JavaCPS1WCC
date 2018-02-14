
package Class_Session_3_Classwork;

import java.util.Scanner;

public class Switch_Statement_NextChoice {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.println("Rock, paper, or scissors?");
		int keyValue = keyInput.nextInt();

		String outcome = determineOutcome(keyValue);

		System.out.println(outcome);
	}

	private static String determineOutcome(int keyValue) {
		switch (keyValue) {
		case 0:
			return "Rock was your choice.";
		case 1:
			return "Paper was your choice.";
		case 2:
			return "Scissors was your choice.";
		default:
			return "Unkown choice was made.";
		}
	}
}
