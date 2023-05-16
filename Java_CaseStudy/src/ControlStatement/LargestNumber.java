package ControlStatement;

public class LargestNumber {
	
	public static void main(String[] args) {
		

		int a = 100;
		int b = 500;
		int c = 200;
		
		if (a > b && a > c) {
			
			System.out.println(a + " is largest ");
			
		} else if (b > a && b > c) {
			
			System.out.println(b + " is largest");
			
		} else if (c > a && c > b) {
			
			System.out.println(c + " is largest");
		}
		
		
	}
	

}
