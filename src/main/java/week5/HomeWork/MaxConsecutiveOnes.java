package week5.HomeWork;

import org.testng.annotations.Test;

public class MaxConsecutiveOnes {

	/*
	 * input is int arr present consecutive ones output is 3 int two variyable left
	 * n right 0
	 * 
	 * find length of arr int[] arr = {1,1,0,1,1,1} output int opt=3;
	 * 
	 * verify arr[0] != arr[1]
	 * 
	 * 
	 * else temp++;
	 * 
	 *  1. Initialise left and right 
	 *  2. increase right till 1 
	 *  3. if number is zero, calculate the window of right-left and reset right and left
	 * as current index
	 * 
	 */

	@Test
	public void test() {

		isMax(new int[] { 1, 1, 0, 1, 1, 1 });
	}

	public int[] isMax(int[] arr) {

		/*
		 * int temp=0; int counter=0; int length = arr.length; for(int
		 * i=0;i<=length;i++) { for(int j=i+1;j<length-1;i++) if(arr[i]==arr[j]) {
		 * counter=arr[i]; System.out.println(counter); //1=1 //1=0 }else { counter++;
		 * //System.out.println(counter); }
		 * 
		 * } return arr;
		 */

		int right = 0;
		int left = 0;
		int length = arr.length;
		while (right <= length) {
			if (right == arr[left]) {

			}
			right++;
		}

		return arr;

	}
}
