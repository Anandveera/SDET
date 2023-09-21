package week5.HomeWork;

import org.junit.Test;

public class CalculateMoney {
	
	//https://leetcode.com/problems/calculate-money-in-leetcode-bank/
	@Test
	public void test1(){
		addOneDollar(4);
	}
	
	public int addOneDollar(int dollor) {
		int temp = 0;
		for(int i = 0;i<=dollor;i++) {
		//	System.out.println(i);
			if(i<dollor) {
				temp = i+1;
			//	temp++;
			System.out.println(temp);
			
			}
			
		}
		return temp;
		
	}

}
