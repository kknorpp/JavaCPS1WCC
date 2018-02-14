package Class_Session_3_Classwork;

import java.util.Scanner;

public class Input_a_Student_Grade {

	public static void main(String[] args) {
		
		Scanner keyInput = new Scanner(System.in);
		
		System.out.println("Please enter a grade: ");
	
		char gradeEntered = keyInput.next().charAt(0);
		
		if ( gradeEntered == 'A' ) {
			System.out.println("Great Job!"); 
		}else if ( gradeEntered == 'B'){
			System.out.println("Nice!");}
					
		else if ( gradeEntered == 'C')
		{
			System.out.println("Could do better!");
			
		}else if ( gradeEntered == 'D') { 
			
			System.out.println("Need to study more!");
			
		}
		else if ( gradeEntered == 'F')
		{	System.out.println("A lot of hard work left to go...");
		}
	}}
