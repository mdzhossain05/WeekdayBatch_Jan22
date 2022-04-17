package testScritptTwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StandardUser {

	WebDriver driver;

	@BeforeTest
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
//	@BeforeMethod
//	public void refreshPage() {
//		driver.navigate().refresh();
//	}
	
	@Parameters({"userName", "password"})
	@Test(priority = 1)
	public void standaredUser(String username, String password) {
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		
		boolean usernameDisplayed = usernameTextbox.isDisplayed();
		
		Assert.assertTrue(usernameTextbox.isDisplayed());
		
//		SoftAssert sa = new SoftAssert();
//		sa.assertTrue(usernameDisplayed);
		

		
//		if(usernameDisplayed == true) {
//			System.out.println("username textbox displayed - test pass");
//		}else {
//			System.out.println("username textbox not displayed - test fail");
//		}
		
		usernameTextbox.sendKeys(username);
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys(password);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
//		if(expectedUrl.equalsIgnoreCase(actualUrl)) {
//			System.out.println("user able login woth valid credentials - test pass");
//		}else {
//			System.out.println("user is not able to login using valid credentials - test fail");
//		}
		
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
