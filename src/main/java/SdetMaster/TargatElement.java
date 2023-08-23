package SdetMaster;

import java.lang.reflect.Array;

import org.junit.Test;



import junit.framework.Assert;

public class TargatElement {
	//Remove the target element in the array
	@Test
	public void FindElemenr() {
		Assert.assertEquals(true, getTargetElement(new int[] {3,1,2,3,4}));
	}
	
	public int[] getTargetElement( int[] num) {
		
		for(int i = 0; i<=num.length;i++) {
			
			for(int j=i+1; j<= num[i+1];j++) {
				
			int	temp = 4;
			
			if(num[j]== temp) {
				System.out.println("Not a TargetElement " +num[j]);
			}else{
			System.out.println("Target helement is = " +num[j]);
			}
		}
		
		}
		return num;
		
		
	}

}
