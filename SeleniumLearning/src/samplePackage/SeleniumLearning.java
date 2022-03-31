package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLearning {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//after the < sign we call that word as TAG
		//Inside that TAG you have ATTRIBUTE and VALUE
		
		String expectedTitle = "swag labs";
		System.out.println(expectedTitle);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {  // == try to match the memory location
			System.out.println("Title matched - test pass");
		}else {
			System.out.println("Title didn't match - test fail");
		}
		
		
		
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("standard_user");
		
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		Thread.sleep(5000);
		
		driver.close();
//		driver.quit();
		
		
//		driver.navigate().to("https://www.amazon.com/");
		
	}

}
