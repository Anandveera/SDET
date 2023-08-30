package Week5.HomeWork;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Challenge67_SortedUniqueArray {
	
//	Challange#67
	@Test
	public void test1() {
		Assert.assertEquals(4, findSamllestValue(new int[] {1,4,3,2}));
	}
	
	public int findSamllestValue(int[] value) {
		int temp = 0;
		Arrays.sort(value);
		for(int i=0;i<=value.length;i+=2) {
			//System.out.println(value[i]);
			temp=value[i];
			System.out.println(temp);
			
		}
		
		return temp;
		
		
	
		
	}
	
}
