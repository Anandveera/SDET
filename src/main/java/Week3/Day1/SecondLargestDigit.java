package Week3.Day1;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

import org.junit.Test;

public class SecondLargestDigit {
	
	/*https://leetcode.com/problems/second-largest-digit-in-a-string/description/
	 * 
	 *
	 * 
	 * need to find the SECOUND Larges num in the string 
	 * 
	 * input is alphanumaric String s="Adjknk1232adf"
	 * output = 2
	 * 
	 * remove the char using replaceAll("[^0-9]")
	 * Convert the string in to toCharArray();
	 * sort();
	 * iterate the loop for(int i =num-1;i<num.length;i--)
	 * if(num[i]-1)
	 * tempt = num[i];
	 * syso(temp)
	 * 
	 *
	 */
@Test
	public void test1() {
	FindSecoundLargestDigit("Adjknk1232adf");
}
@Test
public void test2() {
FindSecoundLargestDigit("Adjknk12432adf");
}

public String FindSecoundLargestDigit(String str) {
	String replaceAll = str.replaceAll("[^0-9]","");
	//System.out.println(replaceAll);
	
	char[] charArray = replaceAll.toCharArray();
	Arrays.sort(charArray);

	for(int i=charArray.length-1;i<=charArray.length;i--) {
		//System.out.println(charArray[i]);
		if(charArray[i-1]!=charArray[i]) {
			System.out.println(charArray[i-1]);
			return str;
		}
	}

	
	return str;
	
}
}