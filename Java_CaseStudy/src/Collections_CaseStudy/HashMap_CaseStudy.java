package Collections_CaseStudy;

import java.util.HashMap;

public class HashMap_CaseStudy {
	
	public static void main(String[] args) {
		
		String str = "my name is udaya";
		String rep = str.replace(" ", "");

		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		
		for (int i = 0; i<rep.length(); i++) {
						
			char ch = rep.charAt(i);
			
			
			if(counts.containsKey(ch)) {
				
				counts.put(ch, counts.get(ch) +  1);
				
			} else {
				
				counts.put(ch, 1);
			}
			
		}
		
		System.out.println(counts);
		
	}

}
