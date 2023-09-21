package week5.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	private WebDriver driver;
	
	public void lanuchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chrome = new ChromeOptions();
	}
	public void loginTestLeaf() {
		
		driver.findElement(By.id("")).sendKeys("demosalesmanager");
		driver.findElement(By.id("")).sendKeys("crmsfa");
	
	}
	

}
