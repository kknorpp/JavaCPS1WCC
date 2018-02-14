package classWork5;

import java.util.Scanner;

public class debugExample {

	public static void main(String[] args) {

		String s = " ";
		char c = ' ';
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Enter 'A' for option A or 'B' for option B.");
			s = keyboard.next();
			s.toLowerCase();
			c = s.charAt(0);

		} while ((c != 'a') && (c != 'b'));
		if (c == 'a') {
			System.out.println("You have selected option A.");
		}
		if (c == 'b') {
			System.out.println("You have selected option B.");
		}
	}

}
