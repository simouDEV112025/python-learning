package oop_projects;

public abstract class BankAccount implements Transaction {
	protected String accountNumber;
	protected double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber =accountNumber;
		this.balance = balance;
	}

}
