package testScript;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginScript {

/**
 * @BeforeSuite
 * @BeforeTest
 * @BeforeClass
 * @BeforeMethod
 * @BeforeGroup
 * @Test
 * @AfterGroup
 * @AfterMethod
 * @AfterClass
 * @AfterTest
 * @AfterSuite
 * 
 */
	
	
	WebDriver driver;
	
		@BeforeTest
		public void setupBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		@Test(priority = 1)
		public void standaredUser(){
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("standard_user");
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		}
		
		@Test(priority = 2)
		public void lockedOutUser(){
			driver.navigate().back();
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("locked_out_user");
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		}
		
		
		@Test(priority = 3)
		public void problemUser(){
			driver.navigate().refresh();
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("problem_user");
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		}
		
		@Test(priority = 4)
		public void performanceGlitchUser(){
			driver.navigate().back();
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("performance_glitch_user");
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		}
		
		@AfterTest
		public void closeBrowser() throws InterruptedException{
		Thread.sleep(5000);
		driver.close();
		}
	

}
