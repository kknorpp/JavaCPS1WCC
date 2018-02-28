package DateExample;

public class methodDemo {

	public static int max(int number1, int number2) {
		if (number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}

	public static int max(int number1, int number2, int number3) {
		int biggerNumber;
		int biggestNumber;
		biggerNumber = max(number1, number2);
		biggestNumber = max(biggerNumber, number3);
		return biggestNumber;
		// return max(max(number1,number2),number3)// other code above is bulky and is
		// done by this nice little line.
		// returning the max number of the 3 with one simple callback rather than a
		// bunch of lines doing the same.
	}

	public static void main(String[] args) {
		int maxNumber;

		maxNumber = methodDemo.max(3, 5, 9);
		int maxNumber2 = (int) Math.floor(3.5);
		System.out.println(maxNumber2);
		System.out.println(maxNumber);
	}
}
