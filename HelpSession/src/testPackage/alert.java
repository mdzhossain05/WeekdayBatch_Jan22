package testPackage;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement alertButton = driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
	
		alertButton.click();
	
//		driver.switchTo().alert().accept();
		
		Alert alrt = driver.switchTo().alert();
		String alertText = alrt.getText();
		System.out.println(alertText);
		
		alrt.sendKeys("some name");
		
		alrt.accept();
		
		
	}

}
