package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLearning {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();
		
		//impicite wait is for all the elements in the page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement clickMeButton = driver.findElement(By.id("promtButton"));
		clickMeButton.click();
		
		Alert alrt = driver.switchTo().alert();
		
		//getText(), sendKeys(), accept(), dismiss()
		String alertMsg = alrt.getText();
		System.out.println(alertMsg);
		
		alrt.sendKeys("Name");
		
		alrt.accept();
		
		// to handle windows alert we have to use Robot class(java) or AutoIT script
	}

}
