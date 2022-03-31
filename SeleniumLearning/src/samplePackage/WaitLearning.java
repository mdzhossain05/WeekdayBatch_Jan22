package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitLearning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		WebElement userName = driver.findElement(By.xpath("//input[@id = 'identifierId']"));
		userName.sendKeys("zakir.hossain@itsurface.com");
		
		
		
		WebElement nextButton = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span"));
		nextButton.click();
		
		
		
//		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		
		WebElement passwordTextbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name = 'password']")));//				 driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		
//		WebElement passwordTextbox = driver.findElement(By.xpath("//input[@name = 'password']"));
		
		passwordTextbox.sendKeys("215463");
		
		// implicite wait - all the elements, explicite wait -- one single element
		//page load, fluent wait
		
	}

}
