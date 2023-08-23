package SdetMaster;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MoveAllZeros {
	@Test
	public void verifyZeroValue() {
		Assert.assertEquals(true, ZeroElement(new int[] {0,1,2,3,0}));
		
	}
	
	public int[] ZeroElement(int[] num) {
		//int[] num1 = {0,1,2,3,0};
		Arrays.sort(num);
		
		
		//int zeroValue = 0;
		for(int i = 0; i<=num.length;i++) {
			System.out.print(num[i]);
			//for(int j = i+1;j<=num1[i];j++) {
				if(num[i] !=0){
			//	zeroValue++;
				System.out.println("Notzero");
			}else {
				System.out.println("Zero" +num[i]);
				num[i]++;
				System.out.println(num[i]++);
			}
		}
		return num;
		
		//return num;
		
	}
}


//}
