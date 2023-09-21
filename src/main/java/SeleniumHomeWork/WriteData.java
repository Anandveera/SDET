package SeleniumHomeWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteData {
	WebDriver driver;
	@BeforeTest
	public void lanuchChrome() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications");
		driver = new FirefoxDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://www.mozilla.org");
	     

		
	}
	@Test
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("/home/poorvika/Downloads");
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
	 
	 public void getData() throws IOException {
		 FileInputStream fs = new FileInputStream("/home/poorvika/Downloads/getData.ods");
		 XSSFWorkbook workbook = new XSSFWorkbook(fs);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 Row row = sheet.getRow(0);
		 Cell cell = row.getCell(0);
		 driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		 
	 }

}
