import java.text.NumberFormat;

public class MonyeFormat_using_NumberFormatclass {
	public static void main(String[] args)
{
	
		
		{
			System.out.println("Default location:");
			NumberFormat moneyFormater =
					NumberFormat.getCurrencyInstance();
			
			System.out.println(moneyFormater.format(19));
			System.out.println(moneyFormater.format(19.81111));
			System.out.println(moneyFormater.format(19.89999));
			System.out.println(moneyFormater.format(19));
			System.out.println();
		}
	}
	
	
	
}
