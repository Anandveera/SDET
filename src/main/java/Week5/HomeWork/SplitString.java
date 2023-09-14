package Week5.HomeWork;

import org.testng.annotations.Test;

public class SplitString {
	@Test
	public void test() {
		String div= divString("RLRRLLRLRL");
		System.out.println(divString(div));
	}
	public String divString(String str) {
		
		char a =0;
		for(int i=0;i<str.length();i++) {
			char output = str.charAt(i);
			if(output=='L') {
				output++;
				//System.out.println(output);
				
			}
		}
		return str;
		
	}

}
