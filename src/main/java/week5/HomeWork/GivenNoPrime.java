package week5.HomeWork;

import org.testng.annotations.Test;

public class GivenNoPrime {
	/*
	 * given num is integer output is boolean(treu,false) given num is prime or not
	 * 
	 * input
	 * 
	 * int num =11;
	 * 
	 * output = true
	 * 
	 * iterate till the num 11 if num is div by 1 or same input num else false
	 * 
	 *
	 * 
	 */
	@Test
	public void test() {
		isPrime(11);
	}

	public void isPrime(int num) {
		int i = 2;
		boolean flag = false;
		while (i < num) {
			// 2<10
			if (num % 2 == 0) {
				i++;

				System.out.println("Not a Prime");
				break;
			}else
			{
				System.out.println("prime num");
				break;
			}

		}

	}

}