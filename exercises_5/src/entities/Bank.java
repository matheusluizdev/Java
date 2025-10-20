package entities;

public class Bank {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	public final double TAX = 5.0;

	public Bank(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public Bank(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return balance;
	}

	public void depositValue(double accountDeposit) {
		this.balance += accountDeposit;
	}

	public void withdrawValue(double accountWithdraw) {
		this.balance -= accountWithdraw + TAX;
	}

	public String toString() {
		return "Account = " + getAccountNumber() + ", Holder: " + getAccountHolder() + ", Balance : $ "
				+ getAccountBalance();
	}

}
