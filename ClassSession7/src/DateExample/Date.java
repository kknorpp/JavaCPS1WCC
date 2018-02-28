package DateExample;

public class Date {

	private String month;
	private int day;
	private int year;

	public Date() {
		this.month = "April";
		this.day = 1;
		this.year = 2018;
	}

	public Date(int year) {
		this.month = "April";
		this.day = 1;
		this.year = year;
	}

	public Date(String month) {
		this.month = month;
		this.day = 1;
		this.year = 2018;
	}

	public String getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;

	}

	public int getYear() {
		return this.year;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return this.month + ", " + this.day + ", " + this.year;
	}

	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = new Date("March");
		Date date3 = new Date(2022);
		date1.setDay(20);
		date3.setDay(20);
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		System.out.println(date3.toString());
	}
}
