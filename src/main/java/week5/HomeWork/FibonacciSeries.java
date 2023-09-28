package week5.HomeWork;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FibonacciSeries {
	
	/*0 1 1 2 3 5 8
	 * sum two num eg
	 * 
	 * add 0 nad 1 and save it one variyable
	 * then add secounf in first
	 * add secound in third 
	 * firstnumber = 0;
	 * secoundnumber = 1;
	 * 
	 * Thirdnumber = firstnumber+secoundnumber
	 * 
	 * firstnumber =secoundnumber;
	 * secoundnumber = Thirdnumber
	 * 
	 */

	@Test
	public void test() {
		isFibonacci(5);
	}
	public int isFibonacci(int num) {
		int firstNumber =0;
		int secoundNumber =1;
		int thiredNumber=0;
		/*
		 * Scanner scan = new Scanner(System.in); num=scan.nextInt();
		 */
		for(int i=0;i<num;i++) {	
			 thiredNumber =firstNumber+secoundNumber;
			firstNumber=secoundNumber;
			secoundNumber=thiredNumber;
			System.out.print(" "+thiredNumber);
			
		}
	
		return num;
		
	}
}
