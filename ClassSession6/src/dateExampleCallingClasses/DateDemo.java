package dateExampleCallingClasses;

/**
 * @author Kyle
 *
 */
public class DateDemo {
	public static void main(String[] args) {

		Date date1 = new Date();
		date1.month = Month.valueOf("JANUARY");
		date1.day = 20;
		date1.year = 2018;

		System.out.println(date1);
	}
}
