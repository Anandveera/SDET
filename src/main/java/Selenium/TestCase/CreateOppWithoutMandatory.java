package Selenium.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import groovy.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOppWithoutMandatory {
	
	/*Test Steps:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Opportunity tab 
5. Click on New button
6. Choose Close date as Tomorrow Date
7. Click on save 
8. Verify the Alert message (Complete this field) displayed for Name and Stage

	 * 
	 */
	WebDriver driver;
	private String username ="hari.radhakrishnan@qeagle.com";
	private String password="Leaf$1234";
	 
		
		@BeforeTest
		public void lanuchChrome() {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
		     driver = new ChromeDriver(options);
			//chromeoption.addArguments(null)
			// driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			driver.get("https://login.salesforce.com");
			
		}
		@Test
		public void login() {
			WebElement name =driver.findElement(By.xpath("//input[@name=\"username\"]"));
			name.sendKeys(username);
			WebElement password1 =driver.findElement(By.xpath("//input[@id=\"password\"]"));
			password1.sendKeys(password);
			driver.findElement(By.id("Login")).click();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[@class=\"appLauncher slds-context-bar__icon-action\"]")).click();
			
			
			driver.findElement(By.xpath("//button[text()=\"View All\"]")).click();
			//driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
			//driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.xpath("//a[@title=\"Opportunities\"]"));
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(element));
			//WebElement element = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input"));
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", element);
			//driver.findElement(By.xpath("//a[@title=\"Accounts\"]")).click();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@title='New']")).click();
			
			    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).clear();
			    driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("31.8.2023");
			    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			   
			    WebElement alertMessage =driver.findElement(By.xpath("//header[@class=\"pageErrorHeader slds-popover__header\"]"));
			    System.out.println(alertMessage.getText());
			    
			    /*
 * 
 * 6. Choose Close date as Tomorrow Date
7. Click on save 
8. Verify the Alert message (Complete this field) displayed for Name and Stage
 */
			
		
	}
}

