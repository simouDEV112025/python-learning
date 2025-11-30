package oop_projects;

import java.util.ArrayList;
import java.util.Collections;

public class Bank {
	private ArrayList<BankAccount>bankAccounts = new ArrayList<BankAccount>();
	
	public void addAccount(BankAccount acc) {
		bankAccounts.add(acc);
	}
	public void findHighestBalance() {
		if(bankAccounts.isEmpty()) {
			System.out.println("No accounts found");
			return;
		}
		Collections.sort(bankAccounts, (b1, b2) -> Double.compare(b2.balance, b1.balance));
		System.out.println("Highest balance account is account #:  "+bankAccounts.get(0).accountNumber
										+" ="+bankAccounts.get(0).balance);
	}
	public BankAccount getAccount(String accNum) {
		BankAccount b = null;
		for(BankAccount bankAccount : bankAccounts) {
			if(bankAccount.accountNumber.equals(accNum)) {
				b = bankAccount;
				break;
			}
		}
		return b;
	}
	public void transfer(String fromAcc, String toAcc, double amount) {
		BankAccount b = getAccount(fromAcc);
		BankAccount c = getAccount(toAcc);
		if(b==null || c==null || amount<=0) {
			System.out.println("Invalid operation!");
			return;
		}
		if (b.withdraw(amount)) {
			c.deposit(amount);
		}
	}

}
