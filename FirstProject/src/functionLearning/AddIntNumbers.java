package functionLearning;

public class AddIntNumbers {
	
//access - return type- name of method			parameters/inputs
	public     int       addTwoNumbers(int numberOne, int numberTwo) {
		int sum = numberOne + numberTwo;
//		System.out.println(sum);
//		System.out.println(sum);
		
		return sum;
	}
	
	public void addThreeNumbers(int numberOne, int numberTwo, int numberThree) {
		int sum = numberOne + numberTwo + numberThree;
		System.out.println(sum);	
	}
	
	public void addFourNumbers(int numberOne, int numberTwo, int numberThree, int numberFour) {
		int sum = numberOne + numberTwo + numberThree + numberFour;
		System.out.println(sum);
	}
	
	public int addNumbers() {
		int sum = 10 + 15;
		return sum;
	}
	

}
