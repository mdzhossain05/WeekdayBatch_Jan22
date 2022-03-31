package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

public class LoginScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		LoginPage lp = new LoginPage(driver);
		
		lp.usernameTextbox().sendKeys("standard_user");
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
		
		driver.navigate().back();
		lp.usernameTextbox().sendKeys("locked_out_user");
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
		
//		driver.navigate().refresh();
		lp.usernameTextbox().clear();
		lp.usernameTextbox().sendKeys("problem_user");
		lp.passwordTextbox().clear();
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
		
		driver.navigate().back();
		lp.usernameTextbox().sendKeys("performance_glitch_user");
		lp.passwordTextbox().sendKeys("secret_sauce");
		lp.signinButton().click();
	}

}
