package Week3.Day1;

import org.junit.Test;

public class LengthOfLastWord {
	
	/*https://leetcode.com/problems/length-of-last-word/
	 * 
	 */
	@Test
	public void test1() {
		FindLastWord("Hello World");
	}
	@Test
	public void test2() {
		FindLastWord("fly me   to   the moon");
	}
	@Test
	public void test3() {
		FindLastWord("luffy is still joyboy");
	}
	
	public String FindLastWord(String str) {
		String trimword = str.trim();
		String lastword =str.substring(str.indexOf(" "));
		//String output = lastword.trim();
		System.out.println(lastword.length()-1);
		
		
		
		return str;
		
	}

}
