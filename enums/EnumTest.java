package enums;

public class EnumTest {
	public double calculateActualCost(double cost,
			     Transactions transactionType){
		double actualCost = 0;
		double charges = transactionType.getCharges();
		actualCost = cost + ((cost * charges ) / 100);
		return actualCost;
	}
	
	public static void main(String[] args) {
		double cost = 200;
		Transactions transactionType = Transactions.CASH;
		
		EnumTest test = new EnumTest();
		double actualCost = test.calculateActualCost(cost, transactionType);
		System.out.println(actualCost);
		
		
	}
}
