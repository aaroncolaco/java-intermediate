package enums;

public enum Transactions {
	DEBIT_CARD(1), CREDIT_CARD(2), NET_BANKING(1.5), CASH;
	
	double charges;
	
	private Transactions(double charges) {
		this.charges = charges;
	}
	
	private Transactions() {
		charges = 0;
	}
	
	double getCharges(){
		return charges;
	}
}
