package first_project;

import java.util.Scanner;

public class Banking_Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		double balance = 0;
		double deposit = 0;
		double withdraw = 0;
		boolean isdone = true;
		
		while(isdone) {
			System.out.print("***************\nBANKING PROGRAM\n***************\n1. Show Balance\n"
					+ "2. Deposit\n3. Withdraw\n4. Exit\n***************\nEnter your choice (1-4): ");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1 -> System.out.printf("%.2fDH\n",getbalance(balance));
			case 2 -> {	System.out.print("Enter the amount you want to deposit: ");
						deposit=scanner.nextDouble();
						balance = getdeposit(deposit, balance);
					}
			case 3 -> {	System.out.print("Enter the amount you want to withdraw: ");
						withdraw=scanner.nextDouble();
						balance = getwithdraw(balance, withdraw);
					}
			case 4 ->{ System.out.println("thank you for using our bank");
						isdone = false;
					}
			
			}
		}
		
		scanner.close();
	}
	static double getbalance(double balance) {
		return balance;
	}
	static double getdeposit(double deposit, double balance) {
		return deposit + balance;
	}
	static double getwithdraw(double balance, double withdraw) {
		return balance - withdraw;
	}
}
