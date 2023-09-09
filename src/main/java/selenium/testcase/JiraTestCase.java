package selenium.testcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JiraTestCase {
	
	WebDriver driver;
	private String username = "hari.radhakrishnan@testleaf.com";
	private String password = "India@123";
	

	@BeforeTest
	public void lanuchChrome() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications");
		driver = new FirefoxDriver(options);
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://api-training.atlassian.net/");
		
	}
	@Test(priority = 1)
	public void enterEmailid() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
		
	}
	@Test(priority = 2)
	public void createSDET() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='summary-field']")).sendKeys("SDET Anand");
		driver.findElement(By.xpath("//button[@type='submit']//span[@class='css-178ag6o'][normalize-space()='Create']")).click();
	}
	@Test(priority = 3)
	public void verifyBaclog() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[normalize-space()='SDET-5']")).click();
		driver.findElement(By.xpath("//a[@data-testid='navigation-apps-sidebar-software-classic.ui.menu.backlog-link']//span[@class='css-1274njb']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search backlog']")).sendKeys("SDET Anand");
		WebElement findElement = driver.findElement(By.xpath("//span[@class='sc-1f9ncqa-0 hKuFgd']//mark[@class='_bfhkwtfv _syaz1fxt'][normalize-space()='SDET Anand']"));
		findElement.isDisplayed();
	}
	@AfterMethod
	public void closeWindow() {
		driver.quit();
	}
	
	
	
	
	

}
