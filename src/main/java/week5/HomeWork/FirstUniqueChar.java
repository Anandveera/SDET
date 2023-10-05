package week5.HomeWork;

import org.testng.annotations.Test;

public class FirstUniqueChar {
	@Test
	public void test() {
		isUnque("anand");
	}
	public int isUnque(String str) {
		
		for(int i =0;i<=str.length();i++) {
			char c = str.charAt(i);
			if(str.charAt(c)==str.lastIndexOf(c)) {
				i++;
				System.out.println(i);
			}
		}
		return -1;
		
	}

}
