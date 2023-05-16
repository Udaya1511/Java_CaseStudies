package Switch_Casestudy3;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class CurrentMonth {

	public static void main(String[] args) {

//		LocalDateTime now = LocalDateTime.now();
//		Month currentmonth = now.getMonth();
//		int monthNumber = currentmonth.getValue();
		
		Scanner key = new Scanner(System.in);
		int monthNumber = key.nextInt();
		System.out.println("please enter the month");
		
//		int monthNumber = 5;

		switch (monthNumber) {

		case 1: 
			System.out.println("Current Month is January");
			break; 

		case 2: 
			System.out.println("Current Month is Febraury");
			break; 
			
		case 3: 
			System.out.println("Current Month is March");
			break; 
			
		case 4: 
			System.out.println("Current Month is April");
			break; 
			
		case 5: 
			System.out.println("Current Month is May");
			break; 
			
		case 6: 
			System.out.println("Current Month is June");
			break; 
			
		case 7: 
			System.out.println("Current Month is July");
			break; 
			
		case 8: 
			System.out.println("Current Month is August");
			break; 
			
		case 9: 
			System.out.println("Current Month is September");
			break; 
			
		case 10: 
			System.out.println("Current Month is October");
			break; 
			
		case 11: 
			System.out.println("Current Month is November");
			break; 
			
		case 12: 
			System.out.println("Current Month is December");
			break; 
			
			default :
				
				System.out.println("Invalid Month Number!");
				break;

		}

	}

}
