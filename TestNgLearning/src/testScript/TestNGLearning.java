package testScript;

import org.testng.annotations.Test;

public class TestNGLearning {
	
	
	@Test(groups = {"smoke", "regression"})
	public void B() {
		System.out.println("B");
	}
	
	@Test(groups = {"sanity","smoke", "regression"})
	public void C() {
		System.out.println("C");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void A() {
		System.out.println("A");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void D() {
		System.out.println("D");
	}
	
	@Test(groups = "sanity")
	public void E() {
		System.out.println("E");
	}

}
