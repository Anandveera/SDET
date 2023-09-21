package week5.HomeWork;

import org.testng.annotations.Test;

public class SumMultiple {
	@Test
	public void test1() {
		add(9);
	}
	@Test
	public void test2() {
		add(7);
	}
	@Test
	public void test3() {
		add(10);
	}
	
	public int add(int n) {
	//int num = 9;
	for(int i=1;i<=n;i++) {
		if(i%3==0||i%5==0||i%7==0) {
			int temp = i;
			int temp1 = temp+temp;
			System.out.println(temp);
		
		}
		
	}
	return n;

}
}
