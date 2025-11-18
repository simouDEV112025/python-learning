package oop_projects;

public class Main {

	public static void main(String[] args) {
		Account sA1 = new SavingsAccount("ismail", 10000);
		Account sA2 = new SavingsAccount("yassin", 30000);
		Account bA1 = new BusinessAccount("khawla", 20589);
		Account bA2 = new BusinessAccount("fatima", 9000);

		Account[] accounts = {bA1,sA1,sA2,bA2};
		
		bA1.disposit(2000);
		bA2.disposit(9000);
		sA1.disposit(900);
		sA2.disposit(30000);
		
		for(Account account : accounts) {
			account.withdraw(11000);
			System.out.println(account);
		}
	}

}
