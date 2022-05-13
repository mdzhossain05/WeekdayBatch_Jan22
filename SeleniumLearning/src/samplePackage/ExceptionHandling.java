package samplePackage;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		
		System.out.println("my name");
		System.out.println("my name");
		
		try {
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("You can not devide any number by zero");
		}
		
		System.out.println("my name");
		System.out.println("my name");
	}

}
