package testScritptThree;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LockedOutUser extends TestBase{

	@Test(priority = 1)
	public void lockedOutUser() {
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("locked_out_user");
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

}
