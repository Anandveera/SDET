package week5.HomeWork;

import java.util.HashMap;
import java.util.Iterator;

public class ValidAnagram {

	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false
	 * otherwise.
	 * 
	 * An Anagram is a word or phrase formed by rearranging the letters of a
	 * different word or phrase, typically using all the original letters exactly
	 * once. Input: s = "anagram", t = "nagaram" Output: true
	 * 
	 * 
	 * input is String
	 * output is valid anagram
	 * initialize hashmap
	 * iterate till end of the string
	 * convert to char and replace char 
	 * 
	 * 
	 * 
	 */
public void test() {
	isValidAnagram("anagaram", "nagaram");
}
public boolean isValidAnagram(String s,String t) {
	HashMap<Character, Integer> map =new HashMap<Character, Integer>();
	HashMap<Character, Integer> map1 =new HashMap<Character, Integer>();
	for(char c:s.toCharArray()) {
		map.put(c, map.getOrDefault(c,0)+1);	
		}
	for(char c:t.toCharArray()) {
		map.put(c, map1.getOrDefault(c,0)+1);	
		}
	return map.equals(map1);
	}
	
	
}


