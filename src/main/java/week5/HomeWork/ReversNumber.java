package week5.HomeWork;

import org.testng.annotations.Test;

public class ReversNumber {
	@Test
	public void test1() {
		findNumber(1201);
	}
	
	public int findNumber(int num) {
		
		int temp =0;
		for(int i=0;i>=num;i--) {
			if(i!=0) {
				temp+=i;
				
			}
			
			
		}
		System.out.println(temp);
		return 0;
		
	}

}
