package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class StepDefinition {
	WebDriver driver;
	LoginPage lp;
	
	@Before
	public void anyBeforeTask() {
		
	}
	
	@Given("^user is in login page using \"([^\"]*)\"$")
	public void user_is_in_login_page_using(String browser) throws Throwable {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\zakir\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("safari")){
			System.setProperty("webdriver.safari.driver", "C:\\Users\\zakir\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new SafariDriver();
		}else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\zakir\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lp = new LoginPage(driver);
	}
	
	@Given("^user is in login page$")
	public void user_navigate_to_sauce_demo() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\zakir\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	
	@When("^user insert username$")
	public void user_insert_username() throws Throwable {
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("standard_user");
	}
	
	@When("^user insert username problem user$")
	public void user_insert_username_problem_user() throws Throwable {
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("problem_user");
	}
	
	@When("^user insert username performance glitch user$")
	public void user_insert_username_performance_glitch_user() throws Throwable {
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("performance_glitch_user");
	}

	@When("^user insert username locked out user$")
	public void user_insert_username_locked_out_user() throws Throwable {
		WebElement usernameTextbox = driver.findElement(By.id("user-name"));
		usernameTextbox.sendKeys("locked_out_user");
	}



	@When("^user insert password$")
	public void user_insert_password() throws Throwable {
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		lp.signinButton().click();
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	    
	}
	
	//hooks
	@After
	public void anyAfterTask() {
		driver.close();
	}

	@When("^user insert username \"([^\"]*)\"$")
	public void user_insert_username(String username) throws Throwable {
		lp.usernameTextbox().sendKeys(username);
	}
	
	@When("^user insert password \"([^\"]*)\"$")
	public void user_insert_password(String password) throws Throwable {
		lp.passwordTextbox().sendKeys(password);
	}

}
