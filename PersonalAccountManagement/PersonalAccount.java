package PersonalAccountManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalAccount {
	int accountNumber;
	String accountHolder;
	double balance;
	private ArrayList<Amount> transactions;
	
	
	public PersonalAccount(int accountNumber, String accountHolder){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		balance=0.0;
		this.transactions = new ArrayList<>();
	}
	
	void deposit(double amount) {
		//update balance
		if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, "Deposit"));
        }
	}
	void withdraw(double amount) {
		//update balance
		if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Amount(amount, "Withdrawal"));
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
	}
	
	void printTransactionHistory() {
		System.out.println("Transaction History for Account #" + accountNumber + " (" + accountHolder + "):");
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
	}
	public double getBalance() {
    	return balance;
    }
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public static void main(String[] args) {
		PersonalAccount account = new PersonalAccount(12345, "John Doe");
        account.deposit(800.0);
        account.withdraw(500.0);
        account.deposit(200.0);
        account.printTransactionHistory();
        System.out.println("Current Balance: $" + account.getBalance());
	}
}
