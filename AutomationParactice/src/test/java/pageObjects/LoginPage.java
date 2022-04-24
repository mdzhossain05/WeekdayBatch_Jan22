package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class LoginPage {
	
	WebDriver driver;

	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement usernameTextbox() {
		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
		return userNameTextbox;
	}
	
	public WebElement passwordTextbox() {
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		return passwordTextBox;
	}
	
	public WebElement signinButton() {
		WebElement signInButton = driver.findElement(By.id("login-button"));
		return signInButton;
	}

}
