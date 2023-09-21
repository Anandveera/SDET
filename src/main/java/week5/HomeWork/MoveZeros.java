package week5.HomeWork;

import java.util.Arrays;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MoveZeros {
	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining
	 * the relative order of the non-zero elements. Note that you must do this
	 * in-place without making a copy of the array. Example 1: Input: nums =
	 * [0,1,0,3,12] Output: [1,3,12,0,0]
	 * 
	 * 
	 * intput is integer arr and output move the zero at end of arr iterate till end
	 * off arr if first index[0] < secound index[1] increment to next index swap
	 * till one by one
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void test() {
		int[] actual=moveZero(new int[]{0,1,2,0});
		int[] expected = {0,1,2,0};
		Assert.assertArrayEquals(expected, actual);
	}

	public int[] moveZero(int[] num) {
		int start = 0;
		int next = 1;
		int temp = 0;

		while (next < num.length) {
			if (num[start] == 0 && num[next] != 0) {
				temp = num[start];
				num[start] = num[next];
				num[next] = temp;
				start++;
				next++;
				
			} 
			else if(num[start]==0 && num[next]==0) {
				next++;
			} 
			else if (num[start]!=0 && num[next]==0) {
				start++;
			}
			
		}
		return num;

		

	}

}
