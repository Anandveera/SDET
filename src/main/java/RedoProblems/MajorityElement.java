package RedoProblems;

import org.junit.Test;

public class MajorityElement {
	
	/*
	 * https://leetcode.com/problems/majority-element/description/
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
	 */
	@Test
public void test1() {
	findElement(new int[] {2,1,1,3});
}
	
	
	
	
	public int findElement(int[] nums) {
		
        int majorityElement = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
                count = 1;
            } else if (majorityElement == num) {
                count++;
            } else {
                count--;
            }
        }

        // At this point, majorityElement is a candidate for the majority element.
        // We need to verify if it occurs more than n/2 times in the array.
        int occurrenceCount = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                occurrenceCount++;
            }
        }
    

        if (occurrenceCount > nums.length / 2) {
            return majorityElement;
        } else {
            throw new IllegalArgumentException("No majority element found.");
        }
    }

	/*
	 * public void test2 () { int[] nums = {2, 2, 3, 2, 4, 2, 5, 2, 2}; // Example
	 * input array try { int [] majorityElement = findMajorityElement(nums);
	 * System.out.println("Majority Element: " + majorityElement); } catch
	 * (IllegalArgumentException e) { System.out.println(e.getMessage()); } }
	 */
}
