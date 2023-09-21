package week5.HomeWork;

import java.util.Iterator;

import org.testng.annotations.Test;

public class ReverseString {
@Test
	public void test() {
		reverseWord("Let's take LeetCode contest");
	}
@Test
public void test1() {
	reverseWord("W");
}

@Test
public void test2() {
	reverseWord(" w e l l c");
}

	
	public String reverseWord(String str) {
		
		String[] split = str.split(" ");
		
		for(String w:split) {
			StringBuilder SB = new StringBuilder(w);
			StringBuilder reverse = SB.reverse();
			System.out.println(reverse);
		}
		
		
	
		return str;
		
	}
	
}
