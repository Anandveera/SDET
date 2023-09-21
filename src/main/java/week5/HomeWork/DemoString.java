package week5.HomeWork;

import org.testng.annotations.Test;

public class DemoString {
	StringBuilder name =new StringBuilder();
	@Test
	public void name() {
		
		for(char ch='a';ch<='z';ch=(char) (ch+2)) {
			//System.out.println(ch);
			
			 name.append(ch);
			
			//String str =new String();
			
			}
		String result = name.toString();
		
		System.out.println(result);
		
		}
			
	}


