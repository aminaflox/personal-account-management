package PersonalAccountManagement;

public class Amount {
	double amount;
	String transactionType;
	//deposit or withdrawal
	
	public Amount(double amount, String transactionType) {
		this.amount=amount;
		this.transactionType=transactionType;
	}
	
	public double getamount() {
		return amount;
	}
	
	public String getTransactionType() {
		return transactionType;
	}
	
	@Override
	public String toString() {
		return transactionType + ": $" + amount;
	}
}
