package Week5.HomeWork;

import org.testng.annotations.Test;

public class PrintArray {
	@Test
	public void main() {
		test(new int[] {1,4,8,5});
	}
	
	public int[] test(int[] num) {
	//	int[] num = {1,4,8,5};	
		for(int i=0;i<=num.length;i++) {
			System.out.println(num[i]);
			
		}
		return num;
	}

}
