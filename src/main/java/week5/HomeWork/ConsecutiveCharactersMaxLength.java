package week5.HomeWork;

import org.testng.annotations.Test;

public class ConsecutiveCharactersMaxLength {
	/*
	 *input is String
	 *output find the max consecutive char length
	 *
	 * String str = "LeetCode"
	 * 
	 * output :2
	 * 
	 * iterate till end of string
	 * convert the string into char
	 * if right char and left char is equal or not
	 * else not equal min the right and add left char
	 * if equal mean save it temp variable 
	 * find the size of the temp variable
	 * 
	 * 
	 */
	@Test
	public void test() {
		MaxLength("leetcode");
	}
	
	public int MaxLength(String str) {
		int left =0;
		int Right=1;
		int current =1;
		int maxwindowsize = 0;
		while(Right<str.length()) {
			char L = str.charAt(left);
			char R = str.charAt(Right);
			if(L==R) {
				current = L+1;
				System.out.println(current);
				
			}else {
				L=R;
				current=1;
				System.out.println();
			}
			Right++;
			maxwindowsize=Math.max(maxwindowsize, current);
		}
		
		return Math.max(maxwindowsize, current);
		
		
	}

}
