package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

public class LockedOutUser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		LoginPage lp = new LoginPage(driver);
		
		lp.usernameTextbox().sendKeys("locked_out_user");
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
	}

}
