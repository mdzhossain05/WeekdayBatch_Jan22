package testScritptTwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PerformanceGlitchUser {

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

	@Parameters({"userName", "password"})
	@Test(priority = 1)
	public void standaredUser(String username, String password) {
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys(username);
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys(password);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
