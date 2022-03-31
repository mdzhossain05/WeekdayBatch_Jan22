package functionality;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement firstClick = driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		firstClick.click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		String alertText = al.getText();
		System.out.println(alertText);
		al.sendKeys("Zakir");
		al.accept();
		/**
		 * al.accept();
		 * al.dismiss();
		 * al.getText();
		 * al.sendKeys("");
		 * 
		 */
		
		//Robot class
	}

}
