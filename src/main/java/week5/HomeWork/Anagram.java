package week5.HomeWork;

public class Anagram {
	
	/*
	 * input is string 
	 * output is valid anagram true or false
	 * 
	 * intput 
	 * String s = "Anagram"
	 * String t= "nagaram"
	 * 
	 * Verify the s and t length is equal or not
	 * conver to string into char
	 * iterate to string s and increment
	 * decrement the t 
	 * 
	 * 
	 * 
	 */
	
	
	public boolean isAnagaram(String s,String t) {
		if(s.length()!=t.length()) {
			return false;	
		}
		short[] arr =new short[26];
		for(int i=0;i<=s.length();i++) {
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
			
		}
		for(int i=0;i<26;i++) {
			if(arr[i]!=0) {
				return false;
			}
		}
		return false;
		
		
		
	}

}
