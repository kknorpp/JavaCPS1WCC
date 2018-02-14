package Class4Problem1;
import java.util.Scanner;	
public class scoreaverager {

	public static void main(String[]args) {
		Scanner keyinput = new Scanner(System.in);
		
		System.out.println("Enter a list of non negative Scores: ");
		System.out.println("Mark the end with a negative number.");
		System.out.println("I Will Compute the average!");
		
		double next, sum = 0;
		int count = 0;
		
		while( next >= 0)
		{
			next = keyInput.nextDouble();
			sum = sum + next;
			count++;
		}
		if( count == 0) {
			System.out.println("")
		}
	}
}
