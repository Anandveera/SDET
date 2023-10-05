import org.testng.annotations.Test;

public class ReverseNumber {
	
	/*
	 * 
	 */
	@Test
	public void test() {
		numberReverse("12345");
	}
	public String numberReverse(String num) {
		
		StringBuilder n = new StringBuilder();
		StringBuilder reverse = n.reverse();
		System.out.println(reverse);
		return num;
		
	}

}
