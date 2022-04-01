package testScript;

import org.testng.annotations.Test;

public class TestNGLearning {
	
	
	@Test(dependsOnMethods = "C")
	public void B() {
		System.out.println("B");
	}
	
	@Test()
	public void C() {
		System.out.println("C");
	}
	
	@Test()
	public void A() {
		System.out.println("A");
	}
	
	

}
