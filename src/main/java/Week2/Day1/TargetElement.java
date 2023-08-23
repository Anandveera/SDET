package Week2.Day1;

import org.junit.Test;

import junit.framework.Assert;

public class TargetElement {
	
	/*
	 * 6. Remove the target element in the array

pseudocode:

>Create a int[] arr = {1,2,2,3}
>Declare the target elements
int target = 2;
for(int i=0; i<=arr.length;i++){

using if condition
//arr[1] != 2;
if(arr[i] != target){ 
output = arr[i];	
i++;


}
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true, findElement(new int[]{1,2,2,3}, 2));
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, findElement(new int[]{1,2,2,3}, 1));
	}
	public int[] findElement(int input [],int target) {
		
	int output= 0;
	for(int i=0;i<input.length;i++) {
		if(input[i]!=target) {
			output =input[i];
			System.out.print(+output);
			//i++;
			//System.out.println(i++);
		}
		else {
			int targetoutput = input[i];
			System.out.println("-------------");
			System.out.println("Target element removed="+targetoutput);
			
		}
	}
	 
		
		return input;
		
	}


}
