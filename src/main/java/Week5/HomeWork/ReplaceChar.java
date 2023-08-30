package Week5.HomeWork;

import org.testng.annotations.Test;

public class ReplaceChar {
	
	/*
	 * Write a program to remove vowels from a String Example: Input: "Hi testleaf students" Output: "H tstlf students"


input is string = Sting ip = "Hi testleaf students"
Cover as char
output is =H tstlf students
use subSting


	 */
	public static void main (String args[]) {
StringBuilder ip = new StringBuilder("Hi testleaf students");
for(int i=0;i<ip.length()-1;i++) {
	char charAt = ip.charAt(i);
	if(charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u') {
		StringBuilder deleteCharAt = ip.deleteCharAt(i);
		System.out.println(ip.deleteCharAt(i));
	}
}
	
	}
}
