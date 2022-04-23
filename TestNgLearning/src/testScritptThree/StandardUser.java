package testScritptThree;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StandardUser extends TestBase{
	
	@Test(priority = 1)
	public void standaredUser() {
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("standard_user");
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
