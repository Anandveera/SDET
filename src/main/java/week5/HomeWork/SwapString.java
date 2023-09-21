package week5.HomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapString {
	@Test
	public void test() {
		Assert.assertEquals(swap("Anand"), "dnanA");
	}
	
	public String swap(String str) {
		char[] ch = str.toCharArray();
		char temp=0;
		int start =0;
		int end=ch.length-1;
		
		while(start<end) {
			temp=ch[start];
			ch[start++]=ch[end];
			ch[end++]=temp;
			
		}
		return "";
		
		
		
		
	}
	

}
