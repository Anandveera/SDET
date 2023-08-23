package SeleniumHomeWork;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class LoginsalesForce {
	/*
	 * Day1_Assignment:
===========
1. Login to https://login.salesforce.com
Username :hari.radhakrishnan@qeagle.com
Password :Leaf$1234
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Accounts tab 
5. Click on New button
6. Enter 'your name' as account name                                           
7. Click save
	 */
	WebDriver driver;
	//WebDriver wait;
	private String username ="hari.radhakrishnan@qeagle.com";
	@BeforeTest
	public void lanuchCromeBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
				 
		}
	@Test
	public void login() {
	WebElement name =driver.findElement(By.xpath("//input[@name=\"username\"]"));
	name.sendKeys(username);
	WebElement password =driver.findElement(By.xpath("//input[@id=\"password\"]"));
	password.sendKeys("Leaf$1234");
	driver.findElement(By.id("Login")).click();
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//div[@class=\"appLauncher slds-context-bar__icon-action\"]")).click();
	
	/*
	 * WebElement
	 * clickViewAll=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By
	 * .xpath("//button[text()=\"View All\"]")))); clickViewAll.click();
	 */
	
	driver.findElement(By.xpath("//button[text()=\"View All\"]")).click();
	//driver.switchTo().alert().accept();
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.xpath("//a[@title='Accounts']"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", element);
	//driver.findElement(By.xpath("//a[@title=\"Accounts\"]")).click();
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@title='New']")).click();
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Anand RM");
	driver.findElement(By.xpath("//button[text()=\"Save\"]")).click();
	System.out.println("Successfully Created");
	//driver.quit();		

}
	@AfterTest
	public void closeApp() {
		driver.quit();
	}
		
	}
