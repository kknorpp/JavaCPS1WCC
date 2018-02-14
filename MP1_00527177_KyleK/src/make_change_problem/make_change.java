package make_change_problem;

import java.util.Scanner;

public class make_change {
	public static void main(String[] args) {

		Scanner keyInput = new Scanner(System.in);

		System.out.print("Enter price in dollars:");

		int priceDollars = keyInput.nextInt();

		System.out.print("Enter price cents:");

		int priceCents = keyInput.nextInt();

		System.out.println("Enter money received for items.");
		System.out.print("Dollars:");

		int moneySpent = keyInput.nextInt();
		System.out.print("Recieved cents:");
		int centsSpent = keyInput.nextInt();
		int totalSpentInCents = moneySpent * 100 + centsSpent;
		int totalPriceInCents = priceDollars * 100 + priceCents;
		int totalChangeInCents = (totalSpentInCents - totalPriceInCents);
		int changeInDollars = totalChangeInCents / 100;

		int changeLeftAfterDollars = totalChangeInCents % 100;

		int changeInQuarters = changeLeftAfterDollars / 25;

		int changeAfterQuarters = changeLeftAfterDollars % 25;

		int changeInDimes = changeAfterQuarters / 10;

		int changeAfterDimes = changeAfterQuarters % 10;

		int changeInNickels = changeAfterDimes / 5;

		int changeAfterNickels = changeAfterDimes % 5;

		int changeInPennies = changeAfterNickels / 1;

		System.out.println("Change returned: ");
		System.out.println(changeInDollars + " Dollars(s)");
		System.out.println(changeInQuarters + " Quarter(s)");
		System.out.println(changeInDimes + " Dime(s)");
		System.out.println(changeInNickels + " Nickel(s)");
		System.out.println(changeInPennies + " Pennies");
		System.exit(changeInPennies);
	}
}
