import java.util.Scanner;
public class average_three_variables {
	public static void main (String[] args)
	{
		int a = 3;
		int b = 4;
		int c = 8;
		double average = ( a + b + c)/3;
		
		System.out.println( " Please type an integer");
		System.out.println( "Second number is " + b);
		System.out.println( "Third number is " + c);
		System.out.println( "The average is " + average);
		System.out.printf("formatted average is%8.3f", average);
	}
}
