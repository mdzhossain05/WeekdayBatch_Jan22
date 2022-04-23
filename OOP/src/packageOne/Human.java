package packageOne;

public class Human extends Animal{
	
	private int b = 20;
	
	public void eat() {
		System.out.println("Human Eat - breakfast, lunch, dinner");
	}
	
	public void eat(String value) {
		System.out.println("Human Eat - breakfast, lunch, dinner with: "+value );
	}
//	
//	public void walk() {
//		System.out.println("Human walk");
//	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}

	

	private void run() {
		System.out.println("run");
	}
	
	public void talk() {
		System.out.println("talk");
	}
}
