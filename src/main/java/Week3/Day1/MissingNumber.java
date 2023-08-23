package Week3.Day1;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class MissingNumber {
	/*
	 * https://leetcode.com/problems/missing-number/description/
	 * 
	 * find the missing number.
	 * Short the array
	 * intput --> integer  arr --- >{0,2,3}
	 * output -->1
	 * iterate for(int i=0;i>=num.length;i++)
	 * for(int j=i+1;j>=num.length;j++)
	 * if(int[i+1]==int[j]){ 1 ==2}
	 * i++;
	 * syso();
	 * else{
	 * syso(i)
	 */
	@Test
	public void test1() {
		findMissingNumber(new int[] {0,3,2});
	}
	@Test
	public void test2() {
		findMissingNumber(new int[] {0,3,1});
	}
	@Test
	public void test3() {
		findMissingNumber(new int[] {1,2,4});
	}
public int[] findMissingNumber(int[] num) {
	int temp = 0;
	Arrays.sort(num);	
	for(int i =0;i<num.length;i++) {
		//System.out.println(num[i]);
		System.out.println("--------------");
		for(int j=i+1;j<num.length;j++) {
			//System.out.println(num[j]);
			temp = num[i]+1;
			if (temp!= num[j]) {
			System.out.println("output"+temp);
					
			}
				
			
		}
		}
		return num;
}
}
