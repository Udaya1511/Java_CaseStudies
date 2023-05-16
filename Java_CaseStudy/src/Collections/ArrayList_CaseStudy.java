package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_CaseStudy {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(50);
		list.add(400);
		list.add(20);
		list.add(30);
		list.add(400);
		list.add(300);
		list.add(105);
		list.add(1000);
		list.add(120);
		list.add(345);
		list.add(222);
		list.add(87);
		list.add(323);
		
		int size = list.size();
		System.out.println("Length of the arrat is: " + size);
		
		Iterator<Integer> Ite = list.iterator();
		
		while(Ite.hasNext()) {
			Integer numbers = Ite.next();
			
			System.out.println(numbers);
			
		}
		
		
	}

}
