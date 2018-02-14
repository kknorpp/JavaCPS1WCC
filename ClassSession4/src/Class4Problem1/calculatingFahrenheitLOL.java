package Class4Problem1;

import java.util.Scanner;

public class calculatingFahrenheitLOL {

	public static void main(String[] args) {

		Scanner keyInput = new Scanner(System.in);

		int i = 0;
		double tempF;
		while (i <= 32) {
			for (i = 0; i <= 32; i++) {
				;
			}
			{
				System.out.println("Please enter a temp from 0 to 32 Centigrade:");
				i = keyInput.nextInt();
				tempF = (i + 32) * (9.0 / 5.0);
				System.out.println((i) + " Degrees Centigrade, and " + (tempF) + " Degrees Fahrenheit");
				System.out.println();
			}

		}
	}

}
