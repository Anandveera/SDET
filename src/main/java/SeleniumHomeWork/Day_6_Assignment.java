package SeleniumHomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.itextpdf.text.log.SysoCounter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_6_Assignment {
	/*
	 *  Day_6 
 Assignment 

1.Launch the url:
https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm 
2.Click Try It Button
3.Click OK/Cancel in the alert
4.Confirm the action is performed correctly by verifying the text !!
 
 

Hint
*Switch to the frame

*Then click Try It with xpath
*Switch to the alert and Enter your name in alert box
*Then perform accept / dismiss
*
Get the text using id 
*
Verify the text based on the action
	 */
	WebDriver driver;
	@BeforeTest
	public void lanuchChrome() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	     driver = new ChromeDriver(options);
		//chromeoption.addArguments(null)
		// driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
	}
	
	@Test
	public void w3School() {
		WebElement findElement = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(findElement);
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		WebElement cliclTryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
		cliclTryIt.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		WebElement getData = driver.findElement(By.xpath("//p[@id='demo']"));
		String text = getData.getText();
		
		if(text.endsWith("OK!")){
				System.out.println("Text="+text);
		
		
	}else if(text.endsWith("Cancel!")) {
		System.out.println("Cancel Text="+text);
	}else {
		System.out.println("Alert not clickable");
	}
	
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	
}
