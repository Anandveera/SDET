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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyOpportunity {
	/*Test Steps:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Opportunity tab 
5. Select the Table view
6. Sort the Opportunities by Close Date in ascending order
7. Verify the Opportunities displayed in ascending order by Close date

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
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		//WebElement element = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
		//driver.findElement(By.xpath("//a[@title=\"Accounts\"]")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@title=\"Display as Table\"]")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[normalize-space()=\"Table\"]")).click();
		driver.findElement(By.xpath("//th[contains(@title,\"Close Date\")]//a[contains(@role,\"button\")]")).click();
		WebElement getTopDate = driver.findElement(By.xpath("//th[contains(@title,\"Close Date\")]//a[contains(@role,\"button\")]//span[1]"));
		String Date = getTopDate.getText();
		
		//WebElement getNextDate = driver.findElement(By.xpath("//td[contains(@class,\"slds-cell-edit cellContainer slds-has-focus\")]"));
		//String nextDate = getTopDate.getText();
		String[] dateformat = Date.split("//.");
		int day = Integer.parseInt(dateformat[0]);
		int Month = Integer.parseInt(dateformat[1]);
		int Year = Integer.parseInt(dateformat[2]);
		
		WebElement getNextDate = driver.findElement(By.xpath("//td[contains(@class,\"slds-cell-edit cellContainer slds-has-focus\")]"));
		String nextDate = getTopDate.getText();
		String[] newdateformat = Date.split("//.");
		int day1 = Integer.parseInt(newdateformat[0]);
		int Month2 = Integer.parseInt(newdateformat[1]);
		int Year3 = Integer.parseInt(newdateformat[2]);
		//
		System.out.println("");
		
		if(day>day1&&Month<=Month2&&Year<=Year3) {
			System.out.println("Displayed in ascending order");
		}
		driver.quit();
		
		

}
}	
