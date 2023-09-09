package selenium.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteOpportunity {
	
	/*
	 * 1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Opportunity tab 
5. Search the Opportunity 'Salesforce Automation by *Your Name*'
6. Click on  the Dropdown icon and Select Delete
7. Verify Whether Oppurtunity is Deleted using Oppurtunity Name


	 */
	WebDriver driver;
	private String username ="praga@praga.com";
	private String password="An$5bawled";
	//ini wait 
	
	//nazreenf@testleaf.com
	//Testleaf@1234
		
	
	
	@BeforeTest
	public void lanuchChrome() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	     driver = new ChromeDriver(options);
		//chromeoption.addArguments(null)
		// driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		driver.get("https://qeagle-d-dev-ed.develop.my.salesforce.com");
		
	}
	
	@Test
	public void login() throws InterruptedException {
	WebElement name =driver.findElement(By.xpath("//input[@name=\"username\"]"));
	name.sendKeys(username);
	WebElement password1 =driver.findElement(By.xpath("//input[@id=\"password\"]"));
	password1.sendKeys(password);
	driver.findElement(By.id("Login")).click();
	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()=\"View All\"]")).click();
	driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
	Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);
	//WebDriverWait wait =new WebDriverWait(driver,60);
	
	//WebElement searchResults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Opportunities']")));
	WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Opportunities']"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", element);
    driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);
  //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='search'])[2]")));
    driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
    driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Anand");
    driver.findElement(By.name("(//input[@type='search'])[2]")).sendKeys(Keys.ENTER);
    System.out.println("Searched Anand");
    
    WebElement findElement = driver.findElement(By.xpath("//div[@class=\"forceVirtualActionMarker forceVirtualAction\"]"));
    executor.executeScript("arguments[0].click();", findElement);
    driver.findElement(By.xpath("//a[@title='Delete']")).click();
    
    
	}

}
