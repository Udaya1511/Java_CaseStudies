package Collections_CaseStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_CaseStudy {
	
	public static void main(String[] args) {
		
		String arr[] = {"Michel","Camle","Arun","Joseph","Walter","Victor"};
		
		LinkedList<String> Llist = new LinkedList<String>();
		
		for (String ar : arr) {
			
			Llist.add(ar);
		}
		
		Llist.remove("potato");
		System.out.println(Llist);
		
		for (String ar : arr) {
			
			if (Llist.contains("Arun")) {
				
				Llist.remove(2);
				
			}
			
			
		}
		
		System.out.println("Size after removing Apple and Potato is : " + Llist.size());
		LinkedList<String> Llst = new LinkedList<String>();
		Llst.addAll(Llist);
		
		System.out.println(Llst);
		
		
	}

}
