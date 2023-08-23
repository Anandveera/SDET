package SdetMaster;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;


public class UniqueOccurences {
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
		Assert.assertEquals(true, uniqueOccurrence(new int[] { 1, 2, 3, 1, 2, 1 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, uniqueOccurrence(new int[] { 2, 3, 1, 2, 1 }));
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, uniqueOccurrence(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));
	}

	/*
	 * 1. Create a Hash map
	 * 2. Iterate through the input
	 * 3. if map contains the current index value
	 * 		a) get the value of the current index from map and
	 * 			add 1 to it and again add it back to map
	 * 		b) add the current index to map with value as 1
	 * 4. Add all values from map to a new set
	 * 5. return the result by comparing the size of set and map
	 */
	public boolean uniqueOccurrence(int[] input) {

		Map<Integer, Integer> occ = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			if (occ.containsKey(input[i])) {
				occ.put(input[i], occ.get(input[i]) + 1);
			} else {
				occ.put(input[i], 1);
			}
		}
		Set<Integer> unique = new HashSet<Integer>(occ.values());


		return occ.size()==unique.size();
	}
}