package string_methods;

import java.util.Scanner;

public class StringMethodsOG {

	private String myStr = "";

	public void readString() {
		System.out.println("Please enter a short sentence.");
		Scanner keyEntry = new Scanner(System.in);
		this.myStr = keyEntry.nextLine();
		System.out.println();

	}

	public void setString(String s) {
		this.myStr = s;

	}

	public int countOccurrences(String s) {
		int sCount = 0;
		int startingIndex = 0;
		while (startingIndex < this.myStr.length()) {
			int lastIndex = this.myStr.indexOf(s, startingIndex);
			if (lastIndex == -1) {
				break;
			} else {
				sCount++;
			}

			startingIndex = lastIndex + s.length();
		}
		return sCount;
	}

	public int countOccurrences(char c) {
		int cCount = 0;

		for (int i = 0; i < this.myStr.length(); i++) {
			if (this.myStr.charAt(i) == c) {
				cCount++;
			}
		}
		return cCount;

	}

	int countUpperCaseLetters() {
		int upperCaseCount = 0;
		for (char c = 'A'; c <= 'Z'; c++) {
			upperCaseCount = upperCaseCount + countOccurrences(c);
		}

		return upperCaseCount;

	}

	int countLowerCaseLetters() {
		int lowerCaseCount = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			lowerCaseCount = lowerCaseCount + countOccurrences(c);

		}

		return lowerCaseCount;
	}

	public void printCounts(String s, char c) {
		System.out.println("*******************************************");
		System.out.println("Analyzing: myStr = " + this.myStr);
		System.out.println("Number of Upper case letters = " + countUpperCaseLetters());
		System.out.println("Number of Lower case letters = " + countLowerCaseLetters());
		System.out.println("Nmber of " + s + " is " + countOccurrences(s));
		System.out.println("Nmber of " + c + " is " + countOccurrences(c));
	}

	public static void main(String[] args) {
		StringMethodsOG msm = new StringMethodsOG();
		msm.readString();
		msm.printCounts("big", 'a');

		msm.setString(
				"Parked in a van down by the river bank .... " + "The van evan vanished near a lot of other vans");
		msm.printCounts("van", 'a');
		StringMethodsOG msm2 = new StringMethodsOG();
		msm2.setString("the elephant in the room wouldn't budge");
		msm2.printCounts("the", 'i');

	}

}
