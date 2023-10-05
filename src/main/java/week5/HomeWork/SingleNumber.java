package week5.HomeWork;

import java.util.HashSet;

public class SingleNumber {

	/*
	 * Given a non-empty array of integers nums, every element appears twice except
	 * for one. Find that single one.
	 * 
	 * You must implement a solution with a linear runtime complexity and use only
	 * constant extra space
	 * 
	 * input is integer arr which contain duplicate element 
	 * output is non duplicate element
	 * 
	 * initialize the hashset
	 * iterate the till arr.len
	 * add arr element
	 * if duplicate come,should remove
	 * 
	 * 
	 */

	
	public int findNumber(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<=arr.length;i++) {
			if(hs.contains(arr[i])) {
				hs.add(arr[i]);
			}else {
				hs.remove(arr[i]);
			}
		}
	
		return 0;
		
	}
	
}
