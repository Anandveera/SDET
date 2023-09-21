package week5.HomeWork;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SortArrayByParity {
	/*
	 * Given an integer array nums, move all the even integers at the beginning of
	 * the array followed by all the odd integers.
	 * 
	 * Return any array that satisfies this condition.
	 * 
	 * Input: nums = [3,1,2,4] Output: [2,4,3,1]
	 * 
	 * sort the arr
	 * itreate the while(int num: arr.length)
	 * compare the 1st of arr[0]%=0
	 * save it in temp+=arr[0]
	 * else
	 */
	@Test
	public void test() {
		//sortEvenArray(new int[] {3,1,2,4});
		Assert.assertArrayEquals(new int[] {3,1,2,4}, new int[] {2,4,3,1});
	}
	
	public int[] sortEvenArray(int[] nums) {
		int left = 0; 
        int right = nums.length - 1; 
        while(left < right ) 
        { 
            if(nums[left] % 2 != 0) 
            { 
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
                System.out.println();
               
            } 
            else 
            { 
                left++; 
                
            } 
        }
        return nums;
        
    }
	            }




