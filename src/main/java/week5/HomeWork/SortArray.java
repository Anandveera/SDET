package week5.HomeWork;

import org.testng.annotations.Test;

public class SortArray {
	/*
	 * input is integer array
	 * output is sort the array
	 * 
	 * int pit int[] arr = {10,20,30,1,2,0}
	 * output  a ={}0,1,2,10,20,30}
	 * 
	 * 
	 * iterate the length of arr to increment
	 * iterate the j to start from i value till length of arr to increment
	 * if i > j check
	 * if greate mean save in new variable 
	 * 
	 * no do the swap 
	 * 
	 * save the trmp variable in arr[i]
	 * the arr[i] save in arr[j]
	 * then arr[j] save in temp
	 * 
	 * for each loop a : arr
	 * 
	 * 
	 */
	@Test
	public void test() {
		isSorted(new int[] {10,20,30,1,2,0});
	}
public void isSorted(int[] arr) {
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			}
		
		}
	
for(int a:arr) {
	System.out.println(a);
}
}
}
