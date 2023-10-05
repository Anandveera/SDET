package week5.HomeWork;

import org.testng.annotations.Test;

public class FaultyKeyboard {
	/*
	 * Your laptop keyboard is faulty, and whenever you type a character 'i' on it,
	 * it reverses the string that you have written. Typing other characters works
	 * as expected.
	 * 
	 * You are given a 0-indexed string s, and you type each character of s using
	 * your faulty keyboard.
	 * 
	 * Return the final string that will be present on your laptop screen.
	 * 
	 * 
	 * input is string output is faulty string
	 * 
	 * 
	 * find the length of the string convert the string into char if i char is
	 * present mean reverse the string and remove i check next char
	 * 
	 */

	@Test
	public void test() {
		isFaulty("string");
	}

	public String isFaulty(String str) {
		char r = 'i';
		StringBuilder s = new StringBuilder();
		for (int i = 0; i <= str.length(); i++) {
			// char faultyI = str.charAt(i);
			// System.out.println(str.charAt(i));
			StringBuilder append = s.append(str.charAt(i));
			if (str.charAt(i) == r) {
				
				append.reverse();
				String string = append.toString();

				System.out.println(string);
			}

		}
		return str;

	}

}
