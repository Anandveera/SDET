package week5.HomeWork;

import org.testng.annotations.Test;

public class SmallestThreeNumber {
	/*
	 * input is integer
	 * output is small digit in given variable
	 * 
	 * declare the three variable a ,b,c
	 * 
	 * if a less then b and a less then c
	 * else b less then a and b less then c
	 * else c is smallest value
	 */
	@Test
	public void test() {
		findSmallestValue(102, 99, 0);
	}
 public void findSmallestValue(int a,int b,int c){
	 
	if(a<b&a<c) {
		System.out.println("a is smallest value="+a);
	}else if(b<a&b<c){
		System.out.println("b is smallest number="+b);
	}else {
		System.out.println("c is smallest value="+c);
	}
 }
}
