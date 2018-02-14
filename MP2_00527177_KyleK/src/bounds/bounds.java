package bounds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bounds {

	public static void main(String[] args) {
		// Input
		System.out.println("Please enter a starting number, an upper bound, and a step increment.");

		Scanner keyInput = new Scanner(System.in);

		int startNum = keyInput.nextInt();
		int upperBound = keyInput.nextInt();
		int stepInc = keyInput.nextInt();

		// Logic
		List<Integer> Steps = calculatingSteps(startNum, upperBound, stepInc);

		// OutputF
		for (int i = 0; i < Steps.size(); i++) {
			if (i % 10 == 0) {
				System.out.println();
			}

			System.out.print(Steps.get(i) + " ");
		}
	}

	private static List<Integer> calculatingSteps(int startNum, int upperBound, int stepInc) {
		List<Integer> steps = new ArrayList<>();

		for (int y = startNum; y < upperBound; y += stepInc) {
			steps.add(y);
		}

		return steps;
	}
}
