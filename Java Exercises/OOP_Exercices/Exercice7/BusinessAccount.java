package oop_projects;

public class BusinessAccount extends Account {
	
	BusinessAccount(String owner, double balance){
		super(owner, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		double newAmount = amount+amount*0.01;
		if(balance-newAmount<-5000) {
			System.out.println("Insufficient funds");
		}
		else {
			balance-=newAmount;
		}
	}
}
