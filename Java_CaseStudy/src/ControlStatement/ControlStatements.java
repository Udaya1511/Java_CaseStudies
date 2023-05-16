package ControlStatement;

import java.util.Iterator;

public class ControlStatements {
	
	public static void main(String[] args) {
		
		//Decision Making
		
		String now = "year";
		int year = 1993;
		String month = "March";
		String day = "Tuesday";
		
		
		if (now == "year") {
			
			if (year > 1989 && year <= 2000) {
				System.out.println("Year is between 1990 to 2000");
			} else if (year > 1999 && year <= 2010) {
				System.out.println("Year is between 2000 to 2010");
			} else {
				
				System.out.println("Year not listed");
			}
			
		} else if (now == "month") {
			if (month == "March") {
				System.out.println("Month is March");
				
			} else {
				System.out.println("Month is not listed");
				
			}
			
			
		} else if (now == "day") {
			System.out.println("Day is Monday");
			
		}
		
		//JumpStatment
		
		int day1 = 5;
		
		switch (day1) {
		
		case 1: System.out.println("I am Monday"); break;
		case 2: System.out.println("I am Tuesday"); break;
		case 3: System.out.println("I am Wednesday"); break;
		case 4: System.out.println("I am Thursday"); break;
		case 5: System.out.println("I am Friday"); break;
		case 6: System.out.println("I am Saturday"); break; 
		case 7: System.out.println("I am Sunday"); break;
			
		
		default:
			System.out.println("All days verified, Finalized day is" + day1);
		}
		
		//Loop Statement
		
		int row = 5;
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < i; j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}

}
