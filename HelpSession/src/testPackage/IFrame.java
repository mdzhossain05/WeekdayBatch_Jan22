package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement descriptionText = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]"));
		
		System.out.println(descriptionText.getText());
		
		driver.switchTo().frame("frame1");
		
		WebElement iframeText = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		
		System.out.println(iframeText.getText());
		
		driver.switchTo().parentFrame();
		
		WebElement descriptionText2 = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]"));
		
		System.out.println(descriptionText2.getText());

	}

}
