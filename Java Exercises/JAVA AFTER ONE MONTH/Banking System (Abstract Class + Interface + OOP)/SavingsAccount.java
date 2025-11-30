package oop_projects;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String accountNumbe, double balance){
		super(accountNumbe ,balance);
	}
	
	@Override
	public void deposit(double amount) {
		this.balance+=amount;
	}
	@Override
	public boolean withdraw(double amount) {
		if(this.balance<amount) {
			System.out.println("Not enough balance in the bank");
			return false;
		}
		this.balance-=amount;
		return true;
	}

}
