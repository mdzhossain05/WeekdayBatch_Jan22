package functionLearning;

public class LearningReturnType {

	//one result for adding two numbers, another result for adding three numbers
	//you have to add these two result and give me the total.
	public static void main(String[] args) {
		LearningReturnType lrt = new LearningReturnType();
//		int numberOne = lrt.addTwoNumbers(10, 20);
//		System.out.println(numberOne);
		
		int a = 10;
		int b = 20;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int addTwoNumbers(int numOne, int numTwo) {
		int sum = numOne + numTwo;
		return sum;
	}
	
	public void getTheRange(int number) {
		
		if(number >= 10 && number<20 ) {
			System.out.println("number is greater than 10 and less than 20");
		}else if(number>=20 && number < 30){
			System.out.println("number is greater than 20 and less than 30");
		}else if(number>=30 && number < 40){
			System.out.println("number is greater than 30 and less than 40");
		}else if(number>=40 && number < 50){
			System.out.println("number is greater than 40 and less than 50");
		}else {
			System.out.println("something");
		}
	}
	
	
	

}
