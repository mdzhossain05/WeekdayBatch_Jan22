package learningJava;

public class ExpenseCalculator {

	public static void main(String[] args) {
		
		int apartmentRent = 1500;
		int utility = 250;
		int carParking = 50;
		int food = 500;
		
		int totalExpense = apartmentRent + utility + carParking + food;
		
		System.out.println(totalExpense);
		
		
		
		
		// you have to create a calculator to calculate buying a car;
		// you should have car price
		
		// you should calculate the tax. e.g. tax is 10% - 20000 * 10% = 2000
		// you should have processing fee
		// you have to show in the output - car price, total payment of that car
		// 
		//
		//car price 30000
		//processing fee 1000
		// tax 30000 * 10% = 3000
		//tax = carPrice * 0.1 (10% - 10/100 = 0.1)
		//total = 34000
		// down payment  = 5000
		//apr = 0
		// credit score is 700 or more then apr 2%
		//					600 or more then apr 3%
		//					500 or more then apr 4%
		//					400 or more then apr 5%
		//					
		//					less than 400 will decline -- new requirement
		
		// apr = 5% (29000 * 0.05 = 30,450)
		
		
		
//		if(creditScore<400) {
//			System.out.println("Application declined, you have to pay the full amount");
//		}else {
//			// afterAddingApr = 30450
//			// timeLine = 5 year = 507.50
//		}
		
		
		
		
		
		
		
		
				
	}
	
	public double calculatingTax(double carPrice, double taxPercentage) {
		// 30000, 10 = 30000 * (10/100)
		double tax = carPrice * (taxPercentage/100);
		return tax;
	}
	
	public double totalCarPrice(double carPrice, double processingFee, double tax) {
		double totalPrice = carPrice + processingFee + tax;
		return totalPrice;
	}

}
