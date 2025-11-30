package oop_projects;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String accountNumber, double balance){
		super(accountNumber ,balance);
	}
	
	@Override
	public void deposit(double amount) {
		this.balance+=amount;
	}
	@Override
	public boolean withdraw(double amount) {
		if((this.balance+500)<amount) {
			System.out.println("Not enough balance in the bank");
			return false;
		}
		this.balance-=amount;
		return true;
	}
}
