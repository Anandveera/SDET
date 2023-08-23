package Week5.HomeWork;

import java.util.Iterator;

public class FindIndexValue {

	
	/*
	 * Given two array, arr1, and arr2 Subtract the sum of arr2 with arr1 respective index value, and also the sum should exclude the respective index in arr2 arr1 = {1,2,3,4} , arr2 = {2,3,4,5} output = { 3+4+5-1, 2+4+5-2, 2+3+5-3, 2+3+4-4 
	 */
	
	public static void main(String args[]) {
		
		
		int[] inValue = {1,2,3,4};
		int[] outValue = {2,3,4,5};
		
		for(int i=0;i<=inValue.length;i++) {
			int temp=inValue[i];
			for(int j=1;j<=outValue.length;j++) {
				if(inValue[i]==outValue[j]) {
					System.out.println(j);
					
				}
		}
		}
		
	}
	
	
}



