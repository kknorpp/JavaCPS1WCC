package Class4Problem1;

import java.util.Scanner;

public class talkingScreen {
	public static void main(String[] args) {

		Scanner keyInput = new Scanner(System.in);
		int randomNum;
		System.out.println("Please tell me something about yourself, enter goodbye to quit: ");
		String infoAboutYou = keyInput.nextLine();

		while (!infoAboutYou.equals("goodbye")) {

			randomNum = (int) (Math.random() * 4);

			if (randomNum == 1) {
				System.out.println("That\'s crazy!");
			} else if (randomNum == 2) {
				System.out.println("It could be worse!");
			} else if (randomNum == 3) {
				System.out.println("That\'s pretty awesome!");
			} else if (randomNum == 4) {
				System.out.println("That\'s wonderful!");
			}

			keyInput.nextLine();
		}

	}
}
