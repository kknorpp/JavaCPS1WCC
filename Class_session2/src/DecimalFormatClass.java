import java.text.*;
import java.text.DecimalFormat;	
public class DecimalFormatClass {

	public static void main(String[] args)
	{
		/*DecimalFormat pattern00dot000 = new DecimalFormat("00.000");
		DecimalFormat pattern0dot00 = new DecimalFormat("0.00");
		
		double d = 12.3456789;
		System.out.println("pattern 00.000");
		System.out.println(pattern00dot000.format(d));
		System.out.println("Pattern 0.00");
		System.out.println(pattern0dot00.format(d));
		
		
		double money = 19.8;
		System.out.println("pattern 00.000");
		System.out.println(pattern00dot000.format(money));*/
		
		DecimalFormat pattern00dot000 = new DecimalFormat("#00.00##");
		//double n = 19.1235;
		System.out.println(pattern00dot000.format(19.1236));
			
					
		
		
		
	}
}
