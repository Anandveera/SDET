package week5.HomeWork;

import org.testng.annotations.Test;

public class FindDegits {

	/*
	 * find length of the integer input is integer output is integer given input is
	 * less then 0 or not div the input by 10 and increment the count++
	 * 
	 */
	@Test
	public void test() {
		totalCount(88078330);
	}

	public void totalCount(long num) {
		int count = 0;

		while (num >= count) {

			num = num / 10;
			count++;

			//
		}
		System.out.println(count);
	}
}
