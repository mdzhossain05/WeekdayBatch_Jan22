package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebElement signinButton(WebDriver driver) {
		WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		return signin;
	}

}
