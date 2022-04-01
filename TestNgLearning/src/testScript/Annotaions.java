package testScript;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaions {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@Test
	public void testOne() {
		System.out.println("Test One");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test Two");
	}

}
