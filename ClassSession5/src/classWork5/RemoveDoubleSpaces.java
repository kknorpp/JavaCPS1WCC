package classWork5;

import java.util.Scanner;

public class RemoveDoubleSpaces {

	public static void main(String[] args) {
		System.out.println("Enter a Sentence: ");
		Scanner keyInput = new Scanner(System.in);
		String userText;
		userText = keyInput.nextLine();
		while (userText.indexOf("  ") != -1) {
			userText = userText.replace("  ", " ");
		}
		System.out.println("New Sentence: " + userText);

	}
}
