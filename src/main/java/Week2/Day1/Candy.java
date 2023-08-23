package Week2.Day1;

import org.junit.Test;

import junit.framework.Assert;

public class Candy {

//	https://leetcode.com/problems/distribute-candies/description/
/*	
 * Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.

Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
 */
	@Test
	public void test1() {
		Assert.assertEquals(maximumCandy(new int[]{1,1,2,2,3,3}), null);
	}
	@Test
	public void test2() {
		Assert.assertEquals(maximumCandy(new int[]{2,4,6,8}), null);
	}
	public int[] maximumCandy( int[] candy) {
		System.out.println("TEST");
		//int[] TotalCandy = {2,4,6,8};
		 int candys =0;
		for(int i=1;i<=candy.length;i++) {
			for(int j=+i;j<=candy.length;j++) {
				 candys = candy[j]/2;
//				 if(candy[i]!/2) {
//					 
//				 }
				
				System.out.println("handsOnCandy "+candys);
			}
		}
		
		
		return candy;
		
	}
	
	
}
