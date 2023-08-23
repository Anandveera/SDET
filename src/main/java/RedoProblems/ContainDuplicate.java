package RedoProblems;

import org.junit.Test;

import junit.framework.Assert;

public class ContainDuplicate {
	
	

	/*https://leetcode.com/problems/contains-duplicate/description/
	 * 
	 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
	 * 
	 * Input: nums = [1,2,3,1]
        Output: true
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true, findDuplicate(new int[] {1,2,3,1}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, findDuplicate(new int[] {1,2,3,4}));
	}
	
	public boolean findDuplicate(int[] num) {
		
		for(int i =0;i<=num.length;i++) {	
			for(int j=i+1; j<=num.length;j++) {
				if(num[i] == num[j]) {
					System.out.println(num[i] == num[j]);
					return true;
				}System.out.println(num[i] == num[j]);
			}
		}
		
		return false;
		
	}

}
