package Class_Session_3_Classwork;

import java.util.Scanner;
import java.lang.Math;
public class Zodiac_Problem {
	public static void main(String[] args) {

		Scanner keyInput = new Scanner(System.in);

		System.out.println("To find out your Zodiac, enter the year you were born:");

		int birthYear = keyInput.nextInt();

		if ((Math.max(birthYear, 1984)- Math.min(birthYear, 1984))%12 == 0) {
			System.out.println("Your Zodiac is the Rat.");
		}
		if ((Math.max(birthYear, 1984) - Math.min(birthYear, 1984))%12 == 1) {
			System.out.println("Your Zodiac is the Ox.");
		}

		if ((Math.max(birthYear, 1984) - Math.min(birthYear, 1984))%12 == 2) {
			System.out.println("Your Zodiac is the Tiger.");
		}

		if ((Math.max(birthYear, 1984) - Math.min(birthYear, 1984))%12 == 3) {
			System.out.println("Your Zodiac is the Rabbit.");
		}

		if ((Math.max(birthYear, 1984) - Math.min(birthYear, 1984))%12 == 4 ) {
			System.out.println("Your Zodiac is the Dragon.");
		}

		if ((Math.max(birthYear, 1989) - Math.min(birthYear, 1984))%12 == 5) {
			System.out.println("Your Zodiac is the Snake.");
		}
		if (birthYear == 1990) {
			System.out.println("Your Zodiac is the Horse.");

		}
		if (birthYear == 1991)
			System.out.println("Your Zodiac is the Goat.");

		if (birthYear == 1992) {
			System.out.println("Your Zodiac is the Monkey.");
		}
		if (birthYear == 1993) {
			System.out.println("Your Zodiac is the Rooster.");

		}
		if (birthYear == 1994) {
			System.out.println("Your Zodiac is the Dog.");

		}
		if (birthYear == 1995) {
			System.out.println("Your Zodiac is the Pig.");
		}

	}
}
