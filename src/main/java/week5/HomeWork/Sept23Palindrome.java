package week5.HomeWork;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Sept23Palindrome {

	/*
	 * Given an input String,return a boolean array by validate each of the word is
	 * a palindrome. Input = "this is a Test" output = [false, false, true, true]
	 * 
	 * 
	 * 
	 * input is String
	 * output is given input is palindrome or not
	 * 
	 * String word = "this is a Test"
	 * split the string base on space and store it one varible
	 * div the variable- left.length/2 ==0
	 * right+1
	 * left-1
	 * 
	 * if(left==right)
	 */
	@Test
public void test() {
	//isPalindrome("this is a Test");
	Assert.assertTrue("this is a Test", false);
}
	
	
	public boolean isPalindrome(String word) {
		
		String[] input = word.split(" ");
		System.out.println(input);
		int left = input.length / 2 - 1, right;
		if (input.length % 2 == 0) {
			right = input.length / 2;
		} else {
			right = input.length/ 2 + 1;
		}
		while (right < input.length) {
			if (input.length != input.length) {
				return false;
			}
		}

		return true;


	}
}
