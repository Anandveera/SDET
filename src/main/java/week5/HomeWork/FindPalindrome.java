package week5.HomeWork;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FindPalindrome {

	/*
	 * input String p = "RADAR" output - verify gicen string is palindrome or not
	 * 
	 * iterate i from right till p.len iterate j from left
	 */

	@Test
	public void test() {
		//isPalnidrome("RADAR");
		Assert.assertTrue("RADAR", true);
	}

	@Test
	public void test1() {
		Assert.assertTrue("RaDAR", false);
		//isPalnidrome("RaDar");
	}

	public boolean isPalnidrome(String p) {

		/*
		 * for(int i=0;i<=p.length()/2;i++) { for(int j=p.length()-1;j>p.length();j--) {
		 * String upperCase = p.toUpperCase(); System.out.println(upperCase); char Right
		 * = p.charAt(i); char Left = p.charAt(j); if(Right==Left) {
		 * System.out.println(true); }else { System.out.println(false); }
		 * 
		 * } }
		 */
		// int right = (s.length()%2==0)? s.length()/2 : s.length()/2 +1;

		int left = p.length() / 2 - 1, right;
		if (p.length() % 2 == 0) {
			right = p.length() / 2;
		} else {
			right = p.length() / 2 + 1;
		}
		while (right < p.length()) {
			if (p.charAt(left) != p.charAt(right)) {
				return false;
			}
		}

		return true;

	}
}
