package week4.Day1;

import org.junit.Test;

import junit.framework.Assert;

public class AddTowNum {

	/*
	 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
	 * 
	 * 
	 * intput  int input = 38;
	 * input/10;
	 * save rmain
	 * if(result<10){
	 * 
	 */
	//@Test
	public void test1() {
		Assert.assertEquals(true,AddTwoNumber(38));
		
	}
	@Test
	public void test2() {
		Assert.assertEquals(true,AddTwoNumber(15));
		
	}
	public int AddTwoNumber(int num) {
		
		int result = 0;
		 int output =num/10;//38/10 = 3
		 System.out.println(output);
		 int Remainder =  num%10;
		 System.out.println(Remainder);
		 
		 result=output+Remainder;
		 System.out.println(result);
		if(result>10) {
			
		
			System.out.println(+output + "+"+Remainder);
			//int addnum = output+Remainder;
			if(result<10) {
				System.out.println("Output is="+result);
			}else {
				int output1 =result/10;//11/10
				 int Remainder1 =  result%10;
				 int result1 = output1+Remainder1;
				 System.out.println(result1);
			}
			return output;
		
		
		
			
			
		}return 0;	
		
}
}
