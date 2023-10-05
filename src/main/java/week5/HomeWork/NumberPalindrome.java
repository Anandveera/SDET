package week5.HomeWork;

import org.junit.Assert;
import org.testng.annotations.Test;

public class NumberPalindrome {
	/*
	 * 
	 * input integer
	 * out given interger is planidrome or not
	 * ini 3 variable temp;remaindernum,reversenum=0;
	 * iterate the while given numis greater then num check
	 * 
	 *num%10;
	 * 
	 * left=num.length/2 ==0
	 * 
	 */
	@Test
	public void test() {
		Assert.assertTrue("10101", true);
	}
	@Test
	public void test1() {
		Assert.assertTrue("1101", false);
	}
public boolean isNumPalindrome(int num) {
	
	int temp=num;
	int remainder=0;
	int reversenum=0;
	while(num<0) {
		remainder=num%10;
		reversenum=remainder*10+remainder;
		num=num/10;
	}
	if(reversenum==num) {
		System.out.println(reversenum);
	}
	
	return false;

	


}
}

