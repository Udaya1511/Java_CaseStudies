package Collections_CaseStudy;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Programm {
	
	public static void main(String[] args) {
		
		String arr[] = {"Mango","tomoto","potato","Apple","Strawberry","Pineapple"};
		
		ArrayList<String> Ar = new ArrayList<String>();
		
		for (String ar : arr) {
			
			Ar.add(ar);
		}
		
		Ar.remove("potato");
		System.out.println(Ar);
		
		for (String ar : arr) {
			
			if (Ar.contains("Apple")) {
				
				Ar.remove(2);
				
			}
		}
		
		System.out.println("Size after removing Apple and Potato is : " + Ar.size());
		
		
	}

}
