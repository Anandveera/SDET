package week4.Day1;

import org.testng.annotations.Test;

public class ReversePrefix {
	@Test
	public  void test1(String word,char ch) { 
		//String word = "dcbaefd";
		//char ch = 'a';
		int indexOf = word.indexOf(ch);
		char[] cs = word.toCharArray();
		for(int i =0;i<=word.length();i++) {
			
			if(word.equals(ch)) {
				
				System.out.println(i);
				
			}
		}
	}
	
	
}
