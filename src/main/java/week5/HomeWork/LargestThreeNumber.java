package week5.HomeWork;

import org.testng.annotations.Test;

public class LargestThreeNumber {
	
	/*
	 * find the largest number
	 * 
	 * 
	 * declear three variables a,bc;
	 * 
	 * if a value is greater then b and b greater then c
	 * or b greater then a or b gretaer then c
	 * else is greater value 
	 */
	@Test
public void test() {
	findLargestNumber(10, 99, 012);
}
	
	public void findLargestNumber(int a,int b,int c) {
		
		if(a>b&a>c) {
			System.out.println(" a is greates value="+a);
		}else if(b>a&b>c){
			System.out.println("b is greates value=" +b);
		}else {
			System.out.println("C is greates value="+c);
		}
		
	}
}
