package dateExampleCallingClasses;

import java.util.Scanner;

public class Date2 {
	private String month;
	private int day;
	private int year;

	public void writeOutput() {
		System.out.println(this.month + ", " + this.day + ", " + this.year);
	}

	public void readInput() {
		Scanner keyInput = new Scanner(System.in);
		System.out.println("Please enter the month, day, and year.");
		this.month = keyInput.next();
		this.day = keyInput.nextInt();
		this.year = keyInput.nextInt();
		System.out.println(getMonth() + ", " + this.day + ", " + this.year);
	}

	public int getDay(int date2) {
		return this.day;
	}

	public int getYear(int date2) {
		return this.year;
	}

	public int getMonth() {
		if (this.month.equals("January")) {
			return 1;
		} else if (this.month.equals("February")) {
			return 2;
		} else if (this.month.equals("March")) {
			return 3;
		} else if (this.month.equals("April")) {
			return 4;
		} else if (this.month.equals("May")) {
			return 5;
		} else if (this.month.equals("June")) {
			return 6;
		} else if (this.month.equals("July")) {
			return 7;
		} else if (this.month.equals("August")) {
			return 8;
		} else if (this.month.equals("September")) {
			return 9;
		} else if (this.month.equals("October")) {
			return 10;
		} else if (this.month.equals("November")) {
			return 11;
		} else if (this.month.equals("Decemeber")) {
			return 12;
		}
		return 0;

	}
}
