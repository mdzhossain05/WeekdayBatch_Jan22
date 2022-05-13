package testPackage;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://west-wind.com/wconnect/wcscripts/fileupload.wwd");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement selectImageBtn = driver.findElement(By.xpath("//*[@id=\"upload\"]"));
		
		Robot robot = new Robot();
		
//		robot.keyPress(keyEvent.VK_d);
//		robot.keyRelease(keyEvent.VK_d);
//		
//		robot.keyPress(keyEvent.VK_TAB);
//		robot.keyRelease(keyEvent.VK_TAB);
//		
//		robot.keyPress(keyEvent.VK_TAB);
//		robot.keyRelease(keyEvent.VK_TAB);
//		
//		robot.keyPress(keyEvent.VK_ENTER);
//		robot.keyRelease(keyEvent.VK_ENTER);
		
		
		
	}

}
