package SdetMaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CountElementX {
	/*
4.Given an integer array arr, count how many elements x there are, 
1   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately.
   
   Psuedo code
   input = [1, 2, 3]
   Add X=1 with index [0] = 1
    1+1 = 2
   output = 2

tempx= 1;

for(int i =0; i=input.length;i++){

int x = input[i]+tempx

While(input ==x){
}

*/
	@Test
	public void isElementFound() {
		Assert.assertEquals(true, addTwoNumbers(new int[] {1,2,3}));
	}
	//@Test
	public void isElementFound1() {
		Assert.assertEquals(true, addTwoNumbers(new int[] {1,0,4,2,3}));
	}
	//@Test
	public void isElementFound2() {
		Assert.assertEquals(true, addTwoNumbers(new int[] {1,1,1}));
	}
public int[] addTwoNumbers(int[] input) {
	//int[] input1 = {1,2,3};
	int tempX= 1;
	//System.out.println("TEST");
	//List<Integer> num = new ArrayList<Integer>();
	for(int i = 0;i<input.length;i++) {
		System.out.println(input[i]);
	//	for(int j = i+1;j<input.length;j++) {
		//http://116.74.33.166/	
		
		int x = input[i+tempX];
		//x++;
		System.out.println("TEST ="+x);
		if(input[i]==x) {
			System.out.println("Equal ="+x);
		
		}else {
			System.out.println("Not equal ="+x);
		}
	
	}
	
	return input;
	
}
	
}
