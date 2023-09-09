package selenium.testcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewOpportunity {
	/*
	 * Test Steps: 1. Login to https://login.salesforce.com 2. Click on toggle menu
	 * button from the left corner 3. Click view All and click Sales from App
	 * Launcher 4. Click on Opportunity tab 5. Click on New button 6. Enter
	 * Opportunity name as 'Salesforce Automation by *Your Name*,Get the text and
	 * Store it 7. Choose close date as Today 8. Select 'Stage' as Need Analysis 9.
	 * click Save and VerifyOppurtunity Name
	 * 
	 * 
	 */

	WebDriver driver;
	private String username = "praga@praga.com";
	private String password = "Hello24Hello";
	// nazreenf@testleaf.com
	// Testleaf@1234

	@BeforeTest
	public void lanuchChrome() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// chromeoption.addArguments(null)
		// driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://qeagle-d-dev-ed.develop.my.salesforce.com");

	}

	@Test
	public void login() {
		WebElement name = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		name.sendKeys(username);
		WebElement password1 = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password1.sendKeys(password);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()=\"View All\"]")).click();
		driver.findElement(By.xpath("//p[text()=\"Sales\"]")).click();
		//// span[normalize-space()='Opportunities']
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Opportunities']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		
		driver.findElement(By.xpath("//div[@title='New']")).click();
		WebElement enterName = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input"));
		enterName.sendKeys("Salesforce Automation by Anand");
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("27.8.2023");
		driver.findElement(By.xpath("(//div[@class=\"slds-form-element__control\"])[3]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();

		// driver.findElement(By.xpath("//button[@id=\"combobox-button-1832\"]")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement findName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		String attribute = findName.getText();
		Assert.assertEquals("Anand", attribute);

	}

}