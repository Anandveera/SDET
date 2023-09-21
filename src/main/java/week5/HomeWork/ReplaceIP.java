package week5.HomeWork;

import org.testng.annotations.Test;

public class ReplaceIP {
	
	/*1. I iterated over each character 
	 * 2. I checked if the character is a . 
	 * 3. If the character was a ., I added to the output [.] 
	 * 4. If it was not a ., i added the character itself */
	@Test
	public void test() {
		isReplaced("1.1.1.1");
		System.out.println(isReplaced("1.1.1.1"));
	}

	
	public static String isReplaced(String ip) {
		
	
		String op= "";
		for(int i=0;i<ip.length();i++) {
			char ct = ip.charAt(i);
			if(ct == '.') {
				op=op+"[.]";
				System.out.println(op);
			}
				else {
					op+=ct;
				}
				
			
			}
		return op;
		}
		
	}


