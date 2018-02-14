package gas_milage_problem;

import java.util.Scanner;

public class gas_milage_problem {
	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);

		System.out.println("Please enter the miles you have traveled and gallons of gas used.");

		float milesT = keyInput.nextFloat();
		float gals = keyInput.nextFloat();
		float mpg1 = (milesT / gals);

		System.out.println("The gas consumption for your trip was " + mpg1 + " mpg.");

	}
}
