package week5.HomeWork;

import org.testng.annotations.Test;

public class Reverse {
	@Test
	public void test() {
		isReverse("Anand");
	}
	
	public void isReverse(String str) {
		
		StringBuilder SB = new StringBuilder(str);
		StringBuilder reverse = SB.reverse();
		System.out.println(reverse);
		}
	

}
