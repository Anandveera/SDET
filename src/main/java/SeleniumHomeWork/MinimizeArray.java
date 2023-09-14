package SeleniumHomeWork;

import java.util.Iterator;

import org.testng.annotations.Test;

public class MinimizeArray {
	/*
	 
	 * 
	 * int[] A={1,2,0,1,0,1}
	 * 
	 * output = {0,0,1,1,1,2}
	 * 
	 * use A. sort();
	 * 
	 * 
	 */
	@Test
	public void test() {
		findMinMax(new int[]{1,2,0,1,0,1});
	}

	public int[] findMinMax(int a[]) {
		int temp=0;
		int arr =a.length;

		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>=a[j]) {
					temp =a[i];
					//temp++;
						
					System.out.println(temp);
					
				}
			}
		}
		
		return a;

		
}
}