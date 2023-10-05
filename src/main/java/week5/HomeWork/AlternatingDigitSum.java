package week5.HomeWork;

import org.testng.annotations.Test;

public class AlternatingDigitSum {

	/*
	 * You are given a positive integer n. Each digit of n has a sign according to
	 * the following rules:
	 * 
	 * The most significant digit is assigned a positive sign. Each other digit has
	 * an opposite sign to its adjacent digits. Return the sum of all digits with
	 * their corresponding sign.
	 * 
	 * Undestaning id need to min symbol in the alternative number and sum all digit and find the output
	 * 
	 * intput is integer 
	 * outout is integer
	 * 
	 *  int num = 521;
	 *  +5-2+1
	 *  int temp = 4
	 *  
	 *  
	 *  while loop iterate till > 0
	 *  num mod % 10
	 *  if num is add temp variable for the 1st time  
	 *  2nd time mins sysmbol add 
	 * 
	 * 
	 */
	
	@Test
	public void test() {
		addAlternateDigit(521);
	}
	public int addAlternateDigit(int num) {
		
		int temp =0;
		boolean add = true;
		while(num>0) {
			int digit =num%10; 
			if(add) {
				temp+=digit;
				System.out.println(temp);
			}else {
				temp-=num;
			}
		}
		return num;
		
	}
}
