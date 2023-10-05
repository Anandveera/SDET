package week5.HomeWork;

import java.util.HashSet;
import java.util.Set;

public class HashMapExample {

	/*
	 * Given a string, validate you have all the characters of a-z words only in
	 * lowercase and whitespace return - true or false
	 * 
	 * 
	 * input is string
	 * output true or false
	 * init hashset
	 * convert into chararray
	 * 
	 * validate the char is in lowercase and it belongs to a-z
	 * 
	 */
	
	public boolean isValidChar(String str) {
		HashSet<Character>hs=new HashSet<Character>();
		char[] c = str.toCharArray();
		for(char each:c) {
			if(each!=' ') {	
				hs.add(each);
			}
		}
			
					
		
		
	
		
	return false;
}
}