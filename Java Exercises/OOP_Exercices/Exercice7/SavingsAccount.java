package oop_projects;

public class SavingsAccount extends Account {

	SavingsAccount(String owner, double balance){
		super(owner, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		double newAmount=amount+2;
		if(newAmount>balance) {
			System.out.println("Insufficient funds");
		}
		else {
			balance -= newAmount;
		}
	}
}
