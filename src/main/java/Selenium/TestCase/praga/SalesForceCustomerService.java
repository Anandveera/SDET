package Selenium.TestCase.praga;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class SalesForceCustomerService {
	
	ChromeDriver driver;
    ChromeOptions Coptions;

    @BeforeMethod
    public void setUp() {

        Coptions = new ChromeOptions().addArguments("--disable-notifications");
        driver = new ChromeDriver(Coptions);
        driver.get("https://login.salesforce.com");
        driver.manage().window().maximize();
        //driver.get("https://qeagle-d-dev-ed.develop.my.salesforce.com");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("Login"));

        username.sendKeys("praga@praga.com");
        password.sendKeys("An$5bawled");
        loginButton.click();

    }

    @Test
    public void loginAndTestCustomerService() {
        driver.findElement(By.xpath("//button[@title='Learn More']")).click();
        System.out.println(driver.getTitle());
        Set<String> windows = driver.getWindowHandles();
        List<String> listOfWindows = new ArrayList<String>(windows);
        driver.switchTo().window(listOfWindows.get(1));
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        Shadow shadowDOM = new Shadow(driver);
        shadowDOM.findElementByXPath("//span[text()='Products']").click();
        WebElement serviceSubMenu = shadowDOM.findElementByXPath("//span[text()='Service']");
        Actions action = new Actions(driver);
        action.moveToElement(serviceSubMenu).perform();
        WebElement serviceMenuLayout = shadowDOM.findElementByXPath("//h2[text()='Service']");
        Assert.assertTrue(serviceMenuLayout.isDisplayed());

        /*SearchContext shadowRoot = driver.findElement(By.xpath("//hgf-c360nav")).getShadowRoot();
        WebElement productsLink = shadowRoot.findElement (By.cssSelector ("span.nav-item-label--l1"));
        driver.executeScript("arguments[0].click()",productsLink);
        WebElement serviceLink = shadowRoot.findElement (By.cssSelector ("hgf-button.l2-button.l2-hybrid-label > div > span:contains('Service')"));
        driver.executeScript("arguments[0].click()",serviceLink);*/
    }
}

