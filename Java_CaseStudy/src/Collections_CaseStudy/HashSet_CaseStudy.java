package Collections_CaseStudy;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSet_CaseStudy {
	
	public static void main(String[] args) {
		
	
	String arr[] = {"Michel","Camel","Arun","Camel","Walter","Camel"};
	
	HashSet<String> Llist = new HashSet<String>();
	
	for (String ar : arr) {
		
		Llist.add(ar);
		
		}
	
	System.out.println("List after removing duplicates using Set : " + Llist);
	
	}

}
