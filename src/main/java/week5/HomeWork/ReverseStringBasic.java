package week5.HomeWork;

import org.testng.annotations.Test;

public class ReverseStringBasic {
	@Test
	public void test() {
		isString("Anand");
	}

	public String isString(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			char num = str.charAt(i);
			System.out.print(num);
		}
		
		return str;	
		
	}
	
	

}
