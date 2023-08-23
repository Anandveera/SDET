package Week.Day1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortArray {
	
	@Test
	public void test1() {
		num(new int[] {2,5,7,3,6});
		
	}
	
	public int[] num(int[] number) {
	//	int[]number = {10,2,5,4,};
	
			Arrays.sort(number);
			System.out.println(Arrays.toString(number));
		
		return number;
		
	}
	

}
