package week5.HomeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.itextpdf.text.log.SysoCounter;

import groovy.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindTopTenDriver {
private	WebDriver driver;
	@Test
	public void getBrowser() {
		WebDriverManager.chromedriver().setup();
	//	ChromeOptions chromeoption = new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formula1.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@id=\"notice\"]/div[@class=\"message-component message-row unstack\"]/button[text()=\"ACCEPT ALL\"]")).click();
		//div[@id="notice"]/div[@class="message-component message-row unstack"]/button[text()="ACCEPT ALL"]
		//div[@class="message-component message-row unstack"]/button[2]	
		
		WebElement cardriver =	driver.findElement(By.xpath("//span[text()='Schedule']/following::span[text()='Results']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(cardriver).perform();
		cardriver.click();
		driver.findElement(By.linkText("Driver Standings")).click();
		
		String name = "Oscar Piastri";
		WebElement listOfDriver=driver.findElement(By.xpath("//table[@class=\"resultsarchive-table\"]/thead/tr/th[3]"));
		List driverName = listOfDriver.findElements(By.linkText("Oscar Piastri"));
		for(int i=0;i<=10;i++) {
			/*
			 * if(driverName==name) {
			 * 
			 * }
			 */
		}
		
		
		}
	
	
}
