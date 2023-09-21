package week5.HomeWork;

import org.testng.annotations.Test;

public class MakeValidString {
	/*
	 * Given a string word to which you can insert letters "a", "b" or "c" anywhere
	 * and any number of times, return the minimum number of letters that must be
	 * inserted so that word becomes valid.
	 * 
	 * A string is called valid if it can be formed by concatenating the string
	 * "abc" several times.
	 * 
	 * intput is String
	 * output valid String
	 * 
	 * intput String name = "a";
	 * output = abc
	 * StringBuilder aaa = StringBuilder(name);
	 * for(char ch = 'a';ch<='c';ch++)
	 *
	 * ch.charAt();
	 * if(ch!=name){
	 *name= name+ch;
	 * aaa.append(name);
	 * aaa.toString;
	 * 
	 */
	@Test
	public void test() {
		isValidString("aca");
	}

	public void isValidString(String name) {
		char ip = ' ';
		StringBuilder aaa = new StringBuilder(name);
		for(char ch ='a';ch<='c';ch++) {
			System.out.println(ch);
			aaa.append(ch);
			ip = aaa.charAt(ch);
		
			
			if(ch!=ip) {
				//int opt=ch+input;
				 
				String string = aaa.toString();
				System.out.println(string);
				
			}else {
				int opt=ch+ch;
				System.out.println(opt);
			}
			
			
		}
		
	}

	
	
}
