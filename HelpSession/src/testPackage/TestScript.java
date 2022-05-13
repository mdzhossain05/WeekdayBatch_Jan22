package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		
//		WebElement doublClickBtn = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
//		
//		act.doubleClick(doublClickBtn).build().perform();
//		
//		WebElement rightClickBtn = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
//		
//		act.contextClick(rightClickBtn).build().perform();
		
		WebElement clickBtn = driver.findElement(By.xpath("//div[@class = 'col-12 mt-4 col-md-6']/div[2]/div[3]/button"));
		
		act.click(clickBtn).build().perform();
	}

}
