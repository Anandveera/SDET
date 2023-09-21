package week5.HomeWork;

import org.testng.annotations.Test;

public class LongestSubString {

	
	/*
	 * A string s is nice if, for every letter of the alphabet that s contains, it
	 * appears both in uppercase and lowercase. For example, "abABB" is nice because
	 * 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b'
	 * appears, but 'B' does not.
	 * 
	 * Given a string s, return the longest substring of s that is nice. If there
	 * are multiple, return the substring of the earliest occurrence. If there are
	 * none, return an empty string.
	 * 
	 * 
	 * input is string String s="YAaBb";
	 * output String output ="AaBb"
	 * 
	 * iterate till s.len
	 * convert the string into char
	 * 
	 * check if char[i]==char[j]
	 * jconver to lowerChar()
	 * if(i.contains(j)
	 * char[i]+=i
	 * else
	 * not equal
	 * 
	 * 
	 */

	@Test
	public void test() {
		niceString("YAaBb");
	}
	private String niceString(String str) {
		String temp = "";
		int length = str.length()-1;
		//str.charAt(length);
		for(int i=0;i<=length;i++) {	
			for(int j=i+1;j<=length-1;j++) {
				
				  char U = str.charAt(i);
				 char L = str.charAt(j);
					//System.out.println(str.charAt(i));

				if(U==L) {
					System.out.println(U);
					
				}	
			}
			
		}
		return str;
		
	}
	
}

