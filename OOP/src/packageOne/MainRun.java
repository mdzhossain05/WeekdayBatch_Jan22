package packageOne;

public class MainRun {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Human human = new Human();
//		Bird bird = new Bird();
//		Dog dog = new Dog();
//		
//		animal.eat();
//		human.eat();
//		human.eat("Rice");
//		human.setB(50);
//		System.out.println(human.getB());
		
		
		
		ExampleStaic ex1 = new ExampleStaic();
		ExampleStaic ex2 = new ExampleStaic();
		
		ex1.companyName = "My comany";
		System.out.println(ex1.companyName);
		System.out.println(ex1.companyName);
		System.out.println(ex1.companyName);
		System.out.println(ex2.companyName);
		System.out.println(ex2.companyName);
		System.out.println(ex2.companyName);
		
		ex2.companyName = "Ebay";
		
		System.out.println(ex1.companyName);
		System.out.println(ex1.companyName);
		System.out.println(ex1.companyName);
		System.out.println(ex2.companyName);
		System.out.println(ex2.companyName);
		System.out.println(ex2.companyName);
		
		
	}

}
