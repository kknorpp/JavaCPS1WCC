package Class4Problem1;

import java.util.Scanner;

public class class4problem1 {

	public static void mian(String[] args) {

		System.out.println("Please enter your yearly salary in the numpad.");
		int annualSalary;
		double taxRate = 0;
		double taxToPay;
		Scanner keyInput = new Scanner(System.in);
		 annualSalary = keyInput.nextInt();
		if( annualSalary >= 0){
		if( annualSalary <= 20000){
		 
			 taxRate = .10;}
		else if(annualSalary <= 50000) {
			taxRate = .20;}
		else if( annualSalary<=100000) {
			taxRate = .30;
		}else {
			taxRate = 40.0;
		}
			
		taxToPay = annualSalary* taxRate;
		System.out.println("Annual Salary: "+ annualSalary);
		System.out.println("Tax to pay is: "+ taxToPay);
		System.out.println("Your final Salary is: " + (annualSalary-taxToPay));
		 {
			
			System.out.println("Cannot calculate negative Values.");
		
	}}
	}
}
