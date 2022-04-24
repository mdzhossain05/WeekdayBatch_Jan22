package packageTwo;

public class MainRun {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
//		Bird bird = new Bird();
		Fish fish = new Fish();
		
		human.eat();
		human.eat("Bashmati Rice");

		fish.eat();
		fish.sleep();
	}

}
