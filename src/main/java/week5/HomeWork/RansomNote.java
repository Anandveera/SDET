package week5.HomeWork;

import java.util.HashMap;

import org.testng.annotations.Test;

public class RansomNote {

	/*
	 * Given two strings ransomNote and magazine, return true if ransomNote can be
	 * constructed by using the letters from magazine and false otherwise.
	 * 
	 * Each letter in magazine can only be used once in ransomNote.
	 * 
	 * 
	 * 
	 * input is string output is true or false String t="aa" String s="aabb";
	 * initialize two hashmap and iterate till length of t string conver the both
	 * string into char if char 'a' is used once or not if used multiple return
	 * false
	 * 
	 * 
	 */
	@Test
	public void test() {
		isRansomNote("aa", "aab");
	}

	public boolean isRansom(String s, String t) {
		HashMap<Character, Integer> ransmap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> magazmap = new HashMap<Character, Integer>();
		for (int i = 0; i <= s.length(); i++) {
			char c = s.charAt(i);

			ransmap.put(s.charAt(i), magazmap.getOrDefault(c, 0) + 1);
		}
		for (int j = 0; j <= t.length(); j++) {
			char c = s.charAt(j);

			ransmap.put(c, magazmap.getOrDefault(c, 0) + 1);
		}

		return false;

	}

	public boolean isRansomNote(String magazine, String ransomNote) {
		StringBuilder str = new StringBuilder(magazine);
		StringBuilder rn = new StringBuilder(ransomNote);

		for (int i = 0; i < ransomNote.length(); i++) {
			if (str.indexOf(ransomNote.substring(i, i + 1)) != -1) {
				str.deleteCharAt(str.indexOf(ransomNote.substring(i, i + 1)));
				rn.deleteCharAt(rn.indexOf(ransomNote.substring(i, i + 1)));
				System.out.println(rn);
			}

		}

		return rn.length() == 0;

	}
	public boolean isNote(String magazine, String ransomNote) {
		short arr[]= new short[26];
		//aa aab
		for(int i=0;i<=magazine.length();i++) {
			char m = magazine.charAt(i);
			arr[m-'a']++;
		}
			for(int j=0;j<=ransomNote.length();j++) {
				char r = ransomNote.charAt(j);
				arr[r-'a']--;
			
			
				
				if(arr[r]<0	) {
					return false;
				}
			}	
			
		
		return true;
		
	}
	
	
}
