package Week5.HomeWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetBookName {
	WebDriver driver;
	private String Username = "8807833092";
	private String password = "8807833092";
	@Test
	public void getBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoption = new ChromeOptions();
		//driver.manage().wait()
	}
	@Test
	public void loginAmazon() {
		
		WebElement sing = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		sing.click();
		/*
		 * Actions action = new Actions(driver); action.moveToElement(sing).perform();
		 */
				
		//driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();
	//	driver.findElement(By.xpath("")).sendKeys("Username");
	//	driver.findElement(By.xpath("")).sendKeys("password");
		
	}
	public void getBook() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("")).sendKeys("Atomic Habits");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		
		
	}

}
