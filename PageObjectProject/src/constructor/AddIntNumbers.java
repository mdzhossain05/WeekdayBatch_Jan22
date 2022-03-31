package constructor;

public class AddIntNumbers {
	int numberOne;
	int numTwo;
	
	public AddIntNumbers(int numberOne, int numberTwo) {
		this.numberOne = numberOne;//10
		this.numTwo = numberTwo;//20	
	}
									
	public void addTwoIntNumbers() {	
		int sum = numberOne + numTwo;
		System.out.println(sum);
	}
	
	public void addThreeIntNumbers(int numberThree) {
		int sum = numberOne + numTwo +numberThree;
		System.out.println(sum);
	}
	
	public void addFourIntNumbers(int numberThree, int numberFour) {
		int sum = numberOne + numTwo +numberThree +numberFour;
		System.out.println(sum);
	}

}
