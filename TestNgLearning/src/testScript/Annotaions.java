package testScript;

import org.testng.annotations.*;


public class Annotaions {
	
	//JUnit - 5 annotations & testNG - 11 annotations
	//make a group of test in testNG
	//run test in parallel in testNG
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@BeforeGroups
	public void beforeGroup() {
		System.out.println("Before Class");
	}
	
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterGroups
	public void afterGroup() {
		System.out.println("After Class");
	}
	
	@Test
	public void testOne() {
		System.out.println("Test One");
	}

}
