package Week5.HomeWork;

import org.testng.annotations.Test;

public class SumOfSquare {
	
	/*
	 * Explanation: There are exactly 3 special elements in nums: nums[1] since 1 divides 4,
	 *  nums[2] since 2 divides 4,
	 *   and nums[4] since 4 divides 4. 
         Hence, the sum of the squares of all special elements of 
         nums is nums[1] * nums[1] + nums[2] * nums[2] + nums[4] * nums[4] = 1 * 1 + 2 * 2 + 4 * 4 = 21.
	 * 
	 * 
	 * input integer array
	 * output is multiply the index * n num
	 * 
	 * input arr[] arr = {1,2,3,4}
	 * 3 is not div by 4
	 * output = 1*1+2*2*4*4 =1+4+16=21
	 * 
	 * int n=arr.len;
	 * for(0;i<=arr.lenth;i++)
	 * if(n%i==0)
	 * temp=i*i
	 * temp+=temp;
	 * 
	 */

	
	@Test(priority = 1)
	public void test() {
		addSquarenum(new int[] {1,2,3,4});
	}
	@Test(priority = 2)
	public void test1() {
		addSquarenum(new int[] {2,7,1,19,18,3});
	}
	
	public int[] addSquarenum(int[] arr) {
		
		
		int n=arr.length;
		for(int i=0;i<=n;i++) {
			if(n%arr[i]==0) {
				int multy =arr[i]*arr[i];
				System.out.println(multy);
				multy+=multy;
				System.out.println(multy);
			}
			else {
				System.out.println(arr[i]+ "Not divisible");
			}
		}
		return arr;
		
	}
}
