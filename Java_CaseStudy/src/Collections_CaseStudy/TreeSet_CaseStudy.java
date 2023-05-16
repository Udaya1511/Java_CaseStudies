package Collections_CaseStudy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_CaseStudy {
	
	public static void main(String[] args) {
		
		String arr[] = {"Michel","Camle","Arun","Joseph","Walter","Victor", "Amala"};
		
		TreeSet<String> st = new TreeSet<String>();
	
	
	for (String ar : arr) {
		
		st.add(ar);
	
	}
	
	System.out.println("Total list of Names in sorted order : " + st);
	
	
	
	
	
	}
}
