package SdetMaster;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class FindUniqueNum {
	//Need to find the unique num from the array
	//input{1,2,3,1}
	//output = 1
	/*contrains 
	 * find the length of the array
	 * compare each num inside the loop
	 * if i == j , print the num
*/
	@Test
	public void findUnique() {
		Assert.assertEquals(true,uniqueNum(new int[] {1,2,2,3,5,4,4,1}));
		//	Assert.assertEquals(true, uniqueOccurrence(new int[] { 1, 2, 3, 1, 2, 1 }));
	}
	
	public int[] uniqueNum(int[] num) {
		for (int i = 0; i <= num.length; i++) {
			for (int j = i+1; j<=num[i]; j++) {
				if(num [i]== num[j]){
					System.out.println(""+ num[i]);
				}
				else if(num [i]!= num[j]) { 
					System.out.println("Unique " + num[i]);
				}
				}
				
	}
	
	

			
		
		
		return num;
		
		
	}
}
