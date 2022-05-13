package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsLearning {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.uhaul.com/");

		driver.manage().window().maximize();
		
		//impicite wait is for all the elements in the page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// mouse hover (moveToElement()), right click (contextClick)
		// double click (doubleClick()), drag and drop (dragAndDrop())
		WebElement trailorsAndTowing = driver.findElement(By.xpath("//*[@id=\"mainHeaderMenu\"]/li[6]/a[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(trailorsAndTowing).build().perform();
	}

}
