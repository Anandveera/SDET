package week5.HomeWork;

import org.testng.annotations.Test;

public class Factorial {
	
	/*
	 * 
	 * intput is integer
	 * output integer
	 * 
	 * int n=5;
	 * output 5*4*3*2*1 =120
	 * num should be greater than 1
	 * 
	 * condistion is min 1 and then mulitple n 
	 * 
	 */

	@Test
	public void test() {
		isFactorial(5);
	}
	
	public int isFactorial(int num) {
		
		int fact =num;
		while(num>1) {
			num--;
			fact=fact*num;
			}
		System.out.println(fact);
		return num;
	
		
	}
}
