package Week2.Day1;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome {
	
	
		/*Given an integer x, return true if x is a Palindromeval,and false otherwise.


/* Steps:
Understanding:
1.Given num is integer 
2.Need to find the given input is Palindromeval mean..left to right and right to left following int should be same eg... 121.323.191.
3.Given input is = 121 – output – true.
4.given input is = 123 – output is – false.

---Pseudo code-----
Integer n = 121;
temp = 0;
while(n<temp)

*/
		
		@Test
		public void test1() {
			Assert.assertEquals(true, isPalindrome(121));
		}
		
		public void test2() {
			Assert.assertEquals(true, isPalindrome(-121));
		}
		
		public boolean isPalindrome(int n) {
			if(n<0) {
				return false;
			}
			
			//We are storing the number in other variable inorder to compare
			int originalNum=n;
			int revNum=0;
			
			while(n>0) {
				int remaindar=n % 10;
				revNum=revNum*10 + remaindar;
				n=n/10;
			}
			if(originalNum==revNum) {
				return true;
			}else {
				return false;
			}
			
		}


		
	}


