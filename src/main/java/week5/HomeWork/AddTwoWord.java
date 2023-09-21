package week5.HomeWork;

import org.testng.annotations.Test;

public class AddTwoWord {
	@Test
	public void test() {
		addWord("adada","adavf");
	}
	
	public String addWord(String word1,String word2) {
		String temp="";
		int length = word1.length();
		int length1 =word2.length();
		for(int i=0;i<length;i++) {
			if(length==length1) {
				temp=temp+word1.charAt(i);
				temp=temp+word2.charAt(i);
				System.out.println(temp);
			}
		}
		
		return temp;
		
	}

} 
