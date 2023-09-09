package selenium.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditOpportunity extends CreateNewOpportunity {
/*Test Steps:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Opportunity tab 
5. Search the Opportunity 'Salesforce Automation by *Your Name*'
6. Click on the Dropdown icon and Select Edit
7. Choose close date as Tomorrow date
8. Select 'Stage' as Perception Analysis
9. Select Deliver Status as In Progress
10. Enter Description as SalesForce
11. Click on Save and Verify Stage as Perception Analysis


 * 	
 */
	WebDriver driver;
	private String username ="praga@praga.com";
	private String password="An$5bawled";
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
		
	}@Test
	public void login() {
		WebElement name =driver.findElement(By.xpath("//input[@name=\"username\"]"));
		name.sendKeys(username);
		WebElement password1 =driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password1.sendKeys(password);
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()=\"View All\"]")).click();
		driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
		////span[normalize-space()='Opportunities']
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[@title='Opportunities']"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
	  //  driver.findElement(By.xpath("//a[@title='Show 3 more actions']//lightning-primitive-icon")).click();
	    WebElement es = driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread'])[3]"));
	   // JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", es);
	    es.click();
	    driver.findElement(By.xpath("//a[@title='Edit']")).click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).clear();
	    driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("28.8.2023");
	    
	    driver.findElement(By.xpath("(//a[@title='Show 3 more actions']")).click();
	    driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();	
	    driver.findElement(By.xpath("//lightning-base-combobox-item[@id=\"combobox-button-2763-0-2763\"]")).click();
	    driver.findElement(By.xpath("//button[@id=\"combobox-button-1867\"]")).click();	
	  // driver.findElement(By.xpath("//lightning-base-combobox-item[@id=\"combobox-button-1867-1-1867\"]//span[@class=\"slds-media__body\"]")).click();
	    driver.findElement(By.xpath("")).sendKeys("SalesForce");
	   driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	

}
	