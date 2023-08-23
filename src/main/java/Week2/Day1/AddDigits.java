package Week2.Day1;

import org.junit.Test;

import junit.framework.Assert;

public class AddDigits {
	
//https://leetcode.com/problems/add-digits/description/

	//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
	/*input =38
	 * need to seprate and add the two numbers
	 * input%10 
	 * Q=30,R=8
	 *Q= Q/10 
	 *output = Q+R;
	 *if(output<10){
	 *else
	 *output %10
	 *
	 * if(out<10)
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true,AddTwoNumber(38));
		
	}
	//@Test
	public void test2() {
		Assert.assertEquals(true,AddTwoNumber(8));
		
	}
	//@Test
	public void test3() {
		Assert.assertEquals(true,AddTwoNumber(10));
		
	}
	public int AddTwoNumber(int num) {
		
		//int input = 38;
		 int output =num/10;
		 int Remainder =  num%10;
		if(num>10) {
			
		
			System.out.println(+output + "+"+Remainder);
			int addnum = output+Remainder;
			if(addnum<10) {
				System.out.println("Output is="+addnum);
			}else {
				int output1 =addnum/10;
				 int Remainder1 =  addnum%10;
				 System.out.println(Remainder1);
			}
			return output;
		
		
		
			
			
		}return 0;	
		
}
}
