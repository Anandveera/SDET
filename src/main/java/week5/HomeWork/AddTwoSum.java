package week5.HomeWork;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AddTwoSum {
	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * 
	 * 
	 * 
	 * input is array of integer output is index of the value
	 * 
	 * int[] arr = {2,7,11,15} target value is 9
	 * 
	 * find the length of the arr add first index and secound index and save it tem
	 * variable
	 * 
	 * if temp value equals to traget value
	 * 
	 * get the the index value
	 * 
	 * int sizeofarray =16; find the hash value int value = key.hashcode(); int
	 * boxedvalue =hashvalue>>16; int index=(sizeOfArray -1)&boxedvalue; int number
	 * = 16; // Binary: 00000000 00000000 00000000 00010000 int result = number >>
	 * 16
	 */
	@Test
	public void test() {
		Assert.assertEquals(new int[] { 0, 1 }, addValue(new int[] { 2, 7, 11, 15 }, 9));
	}

	public int[] addValue(int[] num, int k) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; i < num.length; j++) {
				if (num[j] == k - num[i]) {
					return new int[] { i, j };

				}

			}
		}

		return new int[] {};

	}

	public int[] value(int []nums,int target) {
		int i=0,j=1; 
		while (i<nums.length){ 
			if(nums[i]+nums[j]==target){ 
				return new int[]{i,j}; 
				} else if(j<nums.length-1)
				{ j++; 
				} else{ 
					i++;
					j=i+1;
					} } 
			return new int[] {-1,-1};
	}

}
