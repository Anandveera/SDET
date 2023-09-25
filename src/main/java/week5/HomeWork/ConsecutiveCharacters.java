package week5.HomeWork;

import org.testng.annotations.Test;

public class ConsecutiveCharacters {
	/*
	 * input is String 
	 * output is consecutive char
	 * 
	 * convert the string in char
	 * compare the right side char and left char
	 * if equal move to next increment
	 * not equal mean move to next and comapare
	 */
	@Test
	public void test() {
		isConsecutive("Leetcode");
	}
		public int isConsecutive(String str) {
			int left =0;
			int right=1;
			int current =1;
		int	maxwindowsize=0;
			
	
		//
			while(right<str.length()) {
				char L = str.charAt(left);
				char R = str.charAt(right);
				if(L==R) {
					current=right-left+1;
					System.out.println(current);
				}else {
					left=right;
					current =1;
				}
				right++;
				maxwindowsize=Math.max(maxwindowsize, current);
			}
			return Math.max(maxwindowsize, current);
			
		}
	
	}
