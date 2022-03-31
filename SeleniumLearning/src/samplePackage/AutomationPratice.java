package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;
import pages.SigninPage;

public class AutomationPratice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();
		
		//impicite wait is for all the elements in the page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//explicite wait is for specific element
		WebDriverWait wait = new WebDriverWait(driver, 25);
		
		WebElement signinButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Log in to your customer account']")));//				 driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		
		String expectedTitle = "";
		String actualTitle = driver.getTitle();
		
//		WebElement signButtonAbs = driver.findElement(By.xpath("html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
//		WebElement signButtonRel = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
//		
		WebElement signinButtonLink = driver.findElement(By.partialLinkText("Sign in"));
		signinButtonLink.click();
		
		
		HomePage hp = new HomePage();
		hp.signinButton(driver).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expectedCreateAccountText = "CREATE AN ACCOUNT";
		
		WebElement createAccountLabel = driver.findElement(By.xpath("//form[@id='create-account_form']/h3"));
		
		String actualCreateAccountText = createAccountLabel.getText();
		
		if(actualCreateAccountText.equals(expectedCreateAccountText)) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		
//		WebElement emailTextBox = driver.findElement(By.id("email_create"));
//		emailTextBox.sendKeys("aksfnlan@gmail.com");
		
		SigninPage sp = new SigninPage();
		sp.emailCreateTextbox(driver).sendKeys("aksfnlan@gmail.com");
		
		
		
		
		
//		boolean emailText = emailTextBox.isDisplayed();
//		
//		System.out.println(emailText);
//		
//		if (emailTextBox.isDisplayed()) {
//			System.out.println("test pass - email text box is displayed");
//		} else {
//			System.out.println("test fail - email text box is not displayed");
//		}
		
//		WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
//		createAccountButton.click();
		
		sp.createAccountButton(driver).click();
		
		
		WebElement days = driver.findElement(By.id("days"));
		Select selectDays = new Select(days);
		selectDays.selectByValue("15");
		
		WebElement month = driver.findElement(By.id("months"));
		Select selectMonth = new Select(month);
		selectMonth.selectByValue("3");

			
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//		driver.navigate().back();
//		driver.navigate().forward();
		
//		String expectedSigninPageUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
//		String actualSigninPageUrl = driver.getCurrentUrl();
//		
//		if(expectedSigninPageUrl.equals(actualSigninPageUrl)) {
//			System.out.println("URL matched - test pass");
//		}else {
//			System.out.println("URL didn't match - test fail");
//		}
		Thread.sleep(5000);
		driver.close();
//		driver.quit();
		
		//Absolute Xpath & Relative Xpath
		
		//tag name[@attribute = 'value']
		
		
		
	}

}
