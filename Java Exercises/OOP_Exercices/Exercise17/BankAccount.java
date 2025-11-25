package oop_projects;

public class BankAccount {
	private int accountNumber;
	private String owner;
	private double balance;
	
	public BankAccount(int accountNumber, String owner, double balance) {
		this.accountNumber =accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public String getOwner() {
		return this.owner;
	}
	public double getBalance() {
		return this.balance;
	}
	public void deposit(double balance) {
		this.balance += balance;
	}
	public void withdraw(double balance) {
		this.balance -= balance;
	}
	public void showBalance() {
		System.out.println(this.balance);
	}

}
