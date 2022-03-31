package functionLearning;

import LearningSomethingElse.LearningSomething;

public class SampleFunction {
	
	//Method or function
	public static void main(String[] args) {
		
		AddIntNumbers add = new AddIntNumbers();
		System.out.println(add.addNumbers());
		System.out.println(add.addNumbers());
		System.out.println(add.addNumbers());
		System.out.println(add.addTwoNumbers(20, 52));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//add 10, 20, 30, 40 using addTwoNumbers function
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		AddIntNumbers add = new AddIntNumbers();
//		int numberOne = add.addTwoNumbers(10, 20);
//		int numberTwo = add.addTwoNumbers(30, 40);
//		
//		System.out.println(numberOne);
//		System.out.println(numberTwo);
		
//		int result = numberOne + numberTwo;
//		System.out.println(result);
		
		
		
	
		
		
		
//		AddDoubleNumebrs addDouble = new AddDoubleNumebrs();
//		addDouble.addTwoNumbers(10.25, 25.75);
		
//		SampleFunction sf = new SampleFunction();
//		SampleFunction sample = new SampleFunction();
//		sf.addTwoNumbers(50, 60);
//		sf.addTwoNumbers(50, 50);
//		sf.addTwoNumbers(50, 40);
//		sf.addTwoDoubleNumbers(10.20, 30.25);
//		sf.printMyName("some name");
//		sample.printMyName("any name");
//		sample.addThreeNumbers(10, 20, 30);
//		sample.addFourNumbers(10, 20, 30, 40);
		

		
//		if(a == 40) {
//			int b = 20;
//		}else {
//			int b = 30;
//		}
		
		
	}
	
	
	public void addTwoNumbers(int numberOne, int numberTwo) {
		int sum = numberOne + numberTwo;
		System.out.println(sum);
	}
	
	public void addThreeNumbers(int numberOne, int numberTwo, int numberThree) {
		int sum = numberOne + numberTwo + numberThree;
		System.out.println(sum);
	}
	
	public void addFourNumbers(int numberOne, int numberTwo, int numberThree, int numberFour) {
		int sum = numberOne + numberTwo + numberThree + numberFour;
		System.out.println(sum);
	}
	
	
	public void addTwoDoubleNumbers(double numberOne, double numberTwo) {
		double sum = numberOne + numberTwo;
		System.out.println(sum);
	}
	
	public void printMyName(String firstName) {
		System.out.println(firstName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void somethingElse(String[] args) {
		
		System.out.println("name");
	}
	
	public static void myName() {
		System.out.println("anotherName");
	}
	
	public void anotherName() {
		System.out.println("no error");
	}

}


