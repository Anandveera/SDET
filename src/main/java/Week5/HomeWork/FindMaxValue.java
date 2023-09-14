package Week5.HomeWork;

import org.testng.annotations.Test;

public class FindMaxValue {
	@Test
	public void test() {
		findMaxAverage(new int[] {1,0,0,0}, 1);
	}

	public double findMaxAverage(int[] nums, int k) {
		double max = Integer.MIN_VALUE;
		for (int i = 0; i <= nums.length - k; i++) {
			int sum = nums[i];
			for (int j = i + 1; j < i + k; j++) {
				sum = sum + nums[j];
			}
			double avg = sum / k;
			if (avg > max) {
				max = avg;
				System.out.println(max);
			}
		}
		return max;
	}
}
