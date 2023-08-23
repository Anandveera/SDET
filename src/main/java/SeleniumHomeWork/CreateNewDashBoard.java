package SeleniumHomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewDashBoard {
	/*
	 * Day_2 Assignment
=============
"Test Steps to Create New Dashboard:
1. Login to https://login.salesforce.com
Username :hari.radhakrishnan@qeagle.com
Password :Leaf$1234
2. Click on the toggle menu button from the left corner
3. Click View All and click Dashboards from App Launcher
4. Click on the New Dashboard option
5. Enter Name as 'Salesforce Automation by Your Name ' and Click on Create.
6.Click on Save.
	 */
	WebDriver driver;
	@BeforeTest
	public void lanuchChrome() {
		WebDriverManager.chromedriver().setup();
		//ChromeOptions chromeoption = new ChromeOptions();
		//chromeoption.addArguments(null)
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
	}
	@Test
	public void loginSalesForce() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Leaf$1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//driver.findElement(By.xpath("")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()=\"View All\"]")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		////span[text()='Dashboards']
		WebElement dashboard = driver.findElement(By.xpath("//span[text()='Dashboards']"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", dashboard);
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	   WebElement intoframe =  driver.findElement(By.xpath("//iframe[@title='dashboard']"));
	    driver.switchTo().frame(intoframe);
	    
	  WebElement name=driver.findElement(By.xpath("//div[@class='slds-form-element__control']/input[@id='dashboardNameInput']"));
	  name.click();
	    name.sendKeys("Salesforce Automation by Your Anand");
	  
	    
	    driver.findElement(By.xpath("//button[text()='Create']")).click();
	    
	    
	    
	    
	    
		
		
	}

}
