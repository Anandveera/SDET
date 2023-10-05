package week5.HomeWork;

import org.testng.annotations.Test;

public class PalindromeString {
	
	/*
	 * input is string 
	 * output is string
	 * 
	 * understanding when we reverse the string it should same as actual string
	 * 
	 * input name ="madam"
	 * output madam
	 * 
	 * initiate the string length -1 
	 * conditionis i > 0 and decrement 
	 * convert the string and add variable
	 * 
	 */
	
	@Test
	public void test() {
		isPalindrome("madam");
	}
	@Test
	public void test1() {
		isPalindrome("abcd");
	}
	
	public String isPalindrome(String str) {
		String temp=" ";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
			
		}
		System.out.println(temp);
		return temp;
	}
	
	

}
