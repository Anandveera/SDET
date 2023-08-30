package Week5.HomeWork;

import org.testng.annotations.Test;

public class HalloweenParty {
	
	/*
	 * input integer
	 * output integer
	 * 
	 * 
	 * int choco = 4;
	 * output 4
	 * =4/2;
	 * =2*2
	 */
	@Test
	public void test1() {
	cutChoco(4);
	}
	@Test
	public void test2() {
	cutChoco(7);
	}
	@Test
	public void test3() {
	cutChoco(9);
	
}
 public int cutChoco(int num) {
	
	int temp=(num/2)*(num-num/ 2);
	
System.out.println(temp);
return temp;
}
}
