package packageTwo;

public class Human extends Animal {
	
	public Human() {
		
	}
	
	public Human(int a) {
		
	}
	
	public void eat() {
		System.out.println("eat - breakfast, lunch, dinner");
	}
	
	public void eat(String rice) {
		System.out.println("eat - breakfast, lunch, dinner " + rice);
	}

	public void walk() {
		System.out.println("walk in a road");
	}
	
	public void sleep() {
		System.out.println("sleep in the bed");
	}
	
	public void run() {
		System.out.println("run");
	}
	
	public void drink() {
		System.out.println("drink");
	}
}
