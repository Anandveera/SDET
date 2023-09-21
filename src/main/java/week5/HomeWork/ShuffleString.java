package week5.HomeWork;

import org.testng.annotations.Test;

public class ShuffleString {
	
@Test
	public void test() {
		shuffleChar(new int[] {4,5,6,7,0,2,1,3},"codeleet");
	}

	public String shuffleChar(int[] indices,String word) {
		StringBuilder sb = new StringBuilder(word);
		
		for(int i=0;i<=indices.length;i++) {
			char word1 = word.charAt(i);
			sb.setCharAt(indices[i],word1);
			String string = sb.toString();
			System.out.println(sb.toString());
		}
		
		return toString();
	}
	
}
