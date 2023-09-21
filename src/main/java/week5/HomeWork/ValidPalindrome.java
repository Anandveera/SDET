package week5.HomeWork;

import org.testng.annotations.Test;

public class ValidPalindrome {
	/*
	 * 
	 * 
	 * intput is String output need to validate the given string is palindrome
	 * 
	 * intput String paly = "AbcDbA"
	 * 
	 * output AbcbA
	 * 
	 * for(paly.len;i++) j--; Ch=paly.charAt[i]==paly.charAt[j] StringBuilder a =
	 * new StringBuilder(Ch) a.append(Ch); a.toString();
	 * 
	 */
	// StringBuilder opt = new StringBuilder();
	@Test
	public void test() {
		isPalindrome("AbcDbA");
	}

	public String isPalindrome(String pali) {
		//int temp = pali.length();

		int output = 0;
		for (int i = 0;i<=pali.length();i++) {

			for (int j = i - 1; j >= 0; j--) {
				char forward = pali.charAt(i);
				char backward = pali.charAt(j);
				System.out.println(forward+"="+backward);
				if (forward!=backward) {
					System.out.println(false);
					
				} else {
					System.out.println(true);
				}
			}
		}

		return pali;

	}

}
