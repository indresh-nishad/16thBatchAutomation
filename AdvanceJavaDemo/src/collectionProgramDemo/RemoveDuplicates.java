package collectionProgramDemo;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str= "indianarmy";
		String result ="";
		
		ArrayList<Character> ar = new ArrayList<Character>();
		
		for(int i=0; i<str.length(); i++) {
			if(!ar.contains(str.charAt(i))) {
				
				ar.add(str.charAt(i));
				result = result + str.charAt(i);
				
				
				
			}
			
			
		}
		System.out.println(result);
		
		
		
	}
//nothing just git practice
}
