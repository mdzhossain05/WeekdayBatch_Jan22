package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {
	
	public WebElement emailCreateTextbox(WebDriver driver) {
		WebElement emailCreate = driver.findElement(By.id("email_create"));
		return emailCreate;
	}
	
	public WebElement createAccountButton(WebDriver driver) {
		WebElement createAccount = driver.findElement(By.id("SubmitCreate"));
		return createAccount;
	}

}
