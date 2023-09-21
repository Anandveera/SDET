package week5.HomeWork;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import com.itextpdf.text.log.SysoCounter;

public class AutoEmail {
@Test
	public void emailGenerate() {
		String randomAlphabetic = RandomStringUtils.randomAlphabetic(8);
		String email = randomAlphabetic+"@gmail.com";
		System.out.println(email);

		    	
	}

}
