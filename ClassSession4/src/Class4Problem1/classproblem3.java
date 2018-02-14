package Class4Problem1;

import java.util.Scanner;

public class classproblem3 {

	public static void main(String[] args) {

		Scanner keyInput = new Scanner(System.in);

		// System.out.println("Please enter a number into the keypad, 0 to quit.");
		int num = 1;
		int counter = 0;
		int maxNum = 0;
		while (num != 0) {
			System.out.println("Please enter a number, 0 to quit.");
			num = keyInput.nextInt();
			if (counter == 0) {
				maxNum = num;
			}
			if (num > maxNum) {
				maxNum = num;
			}
			counter++;
			System.out.println("Please enter a number, 0 ot quit");
			num = keyInput.nextInt();
		}

		System.out.println("Done.");

		if (counter != 0) {

		}

		keyInput.close();
	}
}
