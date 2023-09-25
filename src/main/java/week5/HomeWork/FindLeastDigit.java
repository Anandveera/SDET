package week5.HomeWork;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FindLeastDigit {
	@Test
	public void tes() {
		isLeast(new int[] {15,25,4,8,-1,-9});
		//Assert.assertEquals(new int[] {15,25,4,8} , 4);
	}
	public int isLeast(int[] num) {
		int temp =2;
		int y=3;
		for(int i=0;i<num.length;i++) {
			if(num[i]<temp) {
				temp=num[i];
				System.out.println("Maximum number of x and y is: " +Math.max(temp, y)); 
				System.out.println(temp);
				System.out.println("exp of a is: " +Math.exp(y));  
				System.out.println("expm1 of a is: " +Math.expm1(y)); 
				System.out.println("Square root of y is: " + Math.sqrt(y));  
			}	
		}
		return temp;
	}

}
