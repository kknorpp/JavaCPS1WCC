package dateExampleCallingClasses;

public class Date {

	public Month month;
	public int year;
	public int day;

	@Override
	public String toString() {
		return (this.month.name + ", " + this.day + ", " + this.year);

	}
}