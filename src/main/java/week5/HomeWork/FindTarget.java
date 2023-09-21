package week5.HomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindTarget {

	@Test
	public void test() {

		findTarget(new int[] { 0, 2, 1, 5, 7 }, 2);
		Assert.assertEquals(new int[] { 0, 3 }, findTarget(new int[] { -1, 0, 2, 3, 4 }, 2));

	}

	public int[] findTarget(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;
		while (start < end) {

			int temp = nums[start] + nums[end];

			if (temp == target) {

				return new int[] { start, end };
			} else if (temp > target) {
				end--;

			} else {
				start++;
			}

		}
		return new int[] { -1, -1 };
	}

}
