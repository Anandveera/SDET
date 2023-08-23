package week4.Day1;

import org.junit.Test;

public class PivotIndex {
	
	/*https://leetcode.com/problems/find-pivot-index/description/
	 * 
	 * Input: nums = [1,7,3,6,5,6]
        Output: 3
        Explanation:
        The pivot index is 3.
		Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
		Right sum = nums[4] + nums[5] = 5 + 6 = 11
	 * 
	 * 
	 */
	@Test
	public void test1() {
		findIndex(new int[] {1,7,3,6,5,6});
	}
public int findIndex(int[] num) {
	
	
	int rightvalue = 0;
	int leftvalue = 0;
	int pivot = -1;
	for(int i =0;i<num.length;i++) {
		rightvalue= rightvalue+num[i];
		//System.out.println(rightvalue);
	}
	for(int j=0;j<num.length;j++) {
		leftvalue = leftvalue-num[j];
		if(leftvalue==rightvalue) {
			System.out.println(leftvalue);
			return j;
		}
		leftvalue=	leftvalue+num[j];
		
	}
	
	return pivot;
	
	
}
	
}