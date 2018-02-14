package temperature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class temperatureFahrenheit {

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

		double sumC = 0;
		for (Double centigrade : listC) {
			sumC = sumC + centigrade;
		}
		int numC = listC.size();
		double averageC = sumC / numC;

		double sumF = 0;
		for (Double fahrenheit : listF) {
			sumF = sumF + fahrenheit;
		}
		int numF = listF.size();
		double averageF = sumF / numF;
		System.out.printf("Average F %.2f  Average C %.2f", averageF, averageC);
	}
}