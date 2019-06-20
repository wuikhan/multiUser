package application;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {

	static WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "/Users/waqaskhan/Desktop/Selenium Files/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url = "http://qa.ibextechnologies.us/";
		driver.get(url);
		System.out.println("Before method got executed");
	}

	@Test
	public void createContent() throws InterruptedException {
		driver.findElement(By.id("edit-name")).sendKeys("editor");
		driver.findElement(By.id("edit-pass")).sendKeys("Welcome1");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.linkText("Add content")).click();
		driver.findElement(By.id("edit-title")).sendKeys("Test");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("added to the developer branch from windows");
		driver.quit();
	}
}