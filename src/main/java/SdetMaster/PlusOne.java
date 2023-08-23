package SdetMaster;

import org.junit.Assert;
import org.junit.Test;

public class PlusOne {
	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !!
	 * 
	 * What is the input(s)? int[] What is the expected output? int Do I have
	 * constraints to solve the problem? Do I have all informations to go to next
	 * step!! // How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, // is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) // Do I know alternate solutions as well? No
	 * 
	 * No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) // If you know alternate solutions -> find out the O Notations
	 * (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * 
	 */
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {1, 2, 4},  plusOne(new int[] {1, 2, 3} ));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {1, 0},  plusOne(new int[] {9} ));
	}
	
	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[] {4,3,2,2},  plusOne(new int[] {4,3,2,1} ));
	}
	
	// 199 --> 200
	/* 1. Iterate through the array in reverse order
	 * 2. If current index value is less than 9
	 * 		increment it by 1
	 * 		return array
	 * 3. Make the current index to 0
	 * 4. Create a new array with size as size of input array + 1
	 * 5. output[0] = 1 and return this;
	 * 
	 */
	public int[] plusOne(int[] input) { // 9 --> 10
		for (int i = input.length-1; i >=0 ; i--) {
			if(input[i] < 9) { // 
				input[i] = input[i]+1; // 
				return input; // 200
			}
			input[i] = 0; // 0
		}
		int[] output = new int[input.length+1]; // 0, 0
		output[0] = 1; //1, 0
		return output;
		
	}
}
