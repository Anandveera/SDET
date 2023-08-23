package RedoProblems;

import java.util.HashMap;

public class UniqueNumber {
	
	
	/*https://leetcode.com/problems/unique-number-of-occurrences/
	 * Unique Number of Occurrences
	 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

	 */
	
    public static boolean uniqueOccurrences(int[] arr) {
        // Create a HashMap to store the occurrences of each value
        HashMap<Integer,Integer> occurrenceMap = new HashMap<Integer, Integer>();

        // Count the occurrences of each value in the array
        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        // Create a HashMap to store the occurrences of occurrences (i.e., count of occurrences)
        HashMap<Integer, Integer> occurrenceCountMap = new HashMap<Integer, Integer>();

        // Count the occurrences of occurrences
        for (int count : occurrenceMap.values()) {
            occurrenceCountMap.put(count, occurrenceCountMap.getOrDefault(count, 0) + 1);
        }

        // Check if the occurrences of occurrences are unique
        for (int count : occurrenceCountMap.values()) {
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
