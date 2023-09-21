import org.junit.Assert;
import org.testng.annotations.Test;

public class ReturnHighNum {

	/*
	 * 
	 */
	@Test
	public void test() {
		slidingWindow(new int[] { 1, 5, 2, 3, 7, 1 }, 3);
		Assert.assertEquals(slidingWindow(new int[] { 1, 5, 2, 3, 7, 1 }, 0), 12);

	}

	/*
	 * public int higNum(int[] high,int target) { int max=Integer.MIN_VALUE,temp =
	 * 0;
	 * 
	 * for(int i =0;i<=high.length-target;i++) { temp+=high[i]; for(int j
	 * =i;i<i+target;j++) { temp+=high[j]; //System.out.println(temp); if(temp>max)
	 * { max=temp; System.out.println(max); } } } return max;
	 * 
	 * }
	 */

	private int slidingWindow(int[] nums, int k){
		//1. one pointer should work int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
		// not needed second pointer as this is balanced traversal ,right = k-1; 
		//2. Do the required operation till k index while(pointer < k) currentSum += nums[pointer++];
		//3. continue the operation for rest of the array 
		int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
		while( pointer < nums.length){
			max = Math.max(currentSum, max);
			currentSum += nums[pointer] - nums[pointer-k];
			pointer++; 
			}
		return Math.max(currentSum, max); }
}

