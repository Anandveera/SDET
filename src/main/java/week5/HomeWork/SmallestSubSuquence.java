package week5.HomeWork;

import org.testng.annotations.Test;

public class SmallestSubSuquence {
	
	
	/*
	 * input is integer[] arr = {3,4,5,1,2}
	 * output is find the subsequence of index
	 * 
	 * find the length of arr 
	 * iterate j=i+1
	 * int temp += j
	 * if(temp<=k)
	 * 
	 */
	@Test
	public void test() {
		SubSequence(new int[] {1,2,3,4,5},10);
	}

	public int SubSequence(int[] num,int k) {
		
		return k;
	/*	int temp = 0,k=10;
		for(int i=0;i<=num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				temp=num[i]+num[j];
				System.out.println(temp);
				if(temp>k) {
					
					System.out.println(temp);
				}
			}
		}
		return num;
		
	}*/
	
}
}
