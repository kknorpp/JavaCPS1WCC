package temperature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class temperatureFahrenheit2 {

	public static void main(String[] args) {
		double tempC;
		double tempF;
		String prompt = "Please enter the temperature in degrees Centigrade, or <= -100 to exit.";
		Scanner keyInput = new Scanner(System.in);
		List<Double> listC = new ArrayList<>();
		List<Double> listF = new ArrayList<>();
		do {
			System.out.println(prompt);
			tempC = keyInput.nextDouble();

			if (tempC <= -100) {
				break;
			}

			tempF = ((9.0 / 5.0) * (tempC) + 32.0);

			listC.add(tempC);
			listF.add(tempF);

			System.out.printf("Temperature %.2f F, %.2f C.\n", tempF, tempC);
		} while (tempC > -100);

		double averageC = averageTemp(listC);
		double averageF = averageTemp(listF);

		System.out.printf("Average F %.2f  Average C %.2f", averageF, averageC);
	}

	private static double averageTemp(List<Double> temps) {
		double sum = 0;
		for (Double temp : temps) {
			sum = sum + temp;
		}
		return sum / temps.size();
	}
}