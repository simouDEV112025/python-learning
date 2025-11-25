package oop_projects;

import java.util.ArrayList;

public class BankSystem {
	private ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
	
	public void addAccount(BankAccount bankAccount) {
		bankAccounts.add(bankAccount);
	}
	public BankAccount findAccount(int accountNumber) {
		if(bankAccounts.isEmpty()) {
			return null;
		}
		BankAccount bankAccount = null;
		for(int i=0; i<bankAccounts.size(); i++) {
			if(bankAccounts.get(i).getAccountNumber()==accountNumber) {
				bankAccount = bankAccounts.get(i);
			}
		}
		return bankAccount;
	}
	public void transfer(double balance, int id1, int id2) {
		if(balance<0) {
			System.out.println("Cannot trensfer a negative number!");
		}
		findAccount(id1).withdraw(balance);
		findAccount(id2).deposit(balance);
	}

}
