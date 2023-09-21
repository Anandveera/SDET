package week5.HomeWork;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class UniqueEmail {
	
	private String[] split;

	/*
	 * input email id String "test.123@gmail.com"
	 * output is test123@gmail.com
	 * 
	 * split the email id using @
	 * save the first name  and remove '.'
	 * secound name
	 * save first name+secound name
	 * 
	 */
	@Test
	public void test() {
		idEmail("Te+st.123@gmail.com");
	}
	@Test
	public void test1() {
		idEmail("Sea+-m.@gmail.com");
	}
	@Test
	public void test2() {
		idEmail(" ");
	}

	public String idEmail(String eId) {
		int len = eId.length();
		if(len<0) {
			return null;	
		}
		else {
		String[] emaild = eId.split("@");
		String fName = emaild[0];
		//String  firstName= fName.replace(".","");
		String  firstName=	fName.replaceAll("[-+.^]", "");
	    String domain = emaild[1];
	    
	    String emailId = firstName+"@"+domain;
	    System.out.println(emailId);
	    
	    
		
		return eId;
		
	}
	
	}
}
