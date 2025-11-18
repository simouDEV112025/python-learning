package oop_projects;

public abstract class Account {

	protected String owner;
	protected double balance;
	
	public Account(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public void disposit(double amount) {
		balance+=amount;
	}
	public abstract void withdraw(double amount);
	
	@Override
	public String toString() {
		return "Owner : " + this.owner + " | " + "Balance: " + this.balance + " DH";
	}
}


