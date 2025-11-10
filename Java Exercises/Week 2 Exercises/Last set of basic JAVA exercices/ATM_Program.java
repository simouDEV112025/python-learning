package first_project;

import java.util.Scanner;

public class ATM_Program {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		double balance = 1000;
		boolean isTrue = true;
		do {
			interFace();
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 -> showBalance(balance);
			case 2 -> balance = disposit(balance);
			case 3 -> balance = withdraw(balance);
			case 4 -> balance = transfer(balance);
			case 5 -> {
				System.out.println("Thank you for using our ATM 😊");
				isTrue=false;
				}
			default -> System.out.println("Invalid choice!!!");
			}
		} while (isTrue);

		scanner.close();
	}
	static void interFace () {
		System.out.println("==========");
		System.out.println("ATM Simulator");
		System.out.println("==========");
		System.out.println("1. Show Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Transfer Money");
		System.out.println("5. Exit");
	}
	static void showBalance (double balance) {
		System.out.println("Your balance is : " + balance + "DH" );
	}
	static double disposit (double balance) {
		double newBalance = balance;
		System.out.print("Enter the amount you want to disposit: ");
		double disposit = scanner.nextDouble();
		if (disposit>0) {
			System.out.println("Operation was successful!");
			newBalance = disposit + balance;
			System.out.println("Your balance after the disposit is : " + newBalance + "DH");
		}
		else {
			System.out.println("Invalid operation!");
		}
		return newBalance;
	}
	static double withdraw (double balance) {
		double newBalance = balance;
		System.out.print("Enter the amount you want to withdraw: ");
		double withdraw = scanner.nextDouble();
		if (withdraw<balance) {
			System.out.println("Operation was successful");
			newBalance = balance - withdraw;
			System.out.println("Your balance after the withdraw is :  " + newBalance + "DH");
		}
		else {
			System.out.println("Invalide operation");
		}
		return newBalance;
	}
	static double transfer (double balance) {
		double newBalance = balance;
		System.out.print("Enter the amount you want to transfer: ");
		double transfer = scanner.nextDouble();
		if (transfer < balance) {
			System.out.println("The transfer was successful!");
			newBalance = balance - transfer;
			System.out.println("Your balance after the transfer is : " + newBalance + "DH");
		}
		else {
			System.out.println("Invalid operation!");
		}
		return newBalance;
	}
}
