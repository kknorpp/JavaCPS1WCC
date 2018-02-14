package Class_Session_3_Classwork;

import java.util.Scanner;

public class weekly_paycheck {

	public static void main(String[] args) {

		Scanner keyInput = new Scanner(System.in);

		System.out.println("Enter the hours you worked and your hourly pay.");

		double hours = keyInput.nextDouble();
		double dollarsPerHour = keyInput.nextDouble();

		double finalPay = calcuateFinalPay(hours, dollarsPerHour);

		if (hours <= 40) {
			System.out.println("Your paycheck for this week is: " + finalPay + " Dollars.");
			System.out.println("If you work this much each week for a year you will make " + finalPay * 50
					+ " Dollars in a year.");
		}
		if (hours > 40) {
			System.out.println("Your paycheck this week is " + finalPay * 1.5 + " Dollars");
			System.out.println("If you continue to work this much, your yearly earnings will be" + finalPay * 1.5 * 50
					+ " Dollars.");
		}
	}

	private static double calcuateFinalPay(double hours, double dollarsPerHour) {
		double taxRate = .30;

		double finalPay = (hours * dollarsPerHour) - (hours * dollarsPerHour * taxRate);

		return finalPay;
	}
}
