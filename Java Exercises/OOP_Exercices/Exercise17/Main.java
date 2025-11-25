package oop_projects;

public class Main {

	public static void main(String[] args) {
		BankSystem bankSystem = new BankSystem();
		
		BankAccount b1 = new BankAccount(1111, "ismail", 20010);
		BankAccount b2 = new BankAccount(2222, "adam", 4000);
		BankAccount b3 = new BankAccount(3333, "hiba", 65731);
		BankAccount b4 = new BankAccount(4444, "said", 210);
		
		bankSystem.addAccount(b4);
		bankSystem.addAccount(b3);
		bankSystem.addAccount(b2);
		bankSystem.addAccount(b1);
		
		bankSystem.transfer(5730, 3333, 4444);		
		b3.showBalance();
		b4.showBalance();
		
	}

}
 