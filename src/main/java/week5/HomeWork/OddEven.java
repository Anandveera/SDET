package week5.HomeWork;

import org.testng.annotations.Test;


public class OddEven {
	@Test(priority = 1)
	public void test() {
		isEven(11);
	}
	@Test(priority = 2)
	public void test1() {
		isEven(2);
	}
	@Test(priority = 3)
	public void test2() {
		isEven(0);
	}
	public void isEven(int num) {
			
		
		if(num%2==0) {
			System.out.println("Even number:");
		}else {
			System.out.println("Odd number");
		
		}
		
		
	}

}
