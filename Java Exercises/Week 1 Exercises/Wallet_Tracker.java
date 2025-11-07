package first_project;

import java.util.Scanner;

public class Wallet_Tracker {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		double wallet = 0;
		boolean isTrue = true;
		
		do {System.out.println("======================");
			System.out.println("Wallet Tracking System");
			System.out.println("======================");
			System.out.println("1.Show Wallet\n2.Add Money\n3.Spend Money\n4.Exit");
			System.out.print("Enter your choice (1-4): ");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1 ->show_wallet(wallet);
			case 2 ->wallet = add_money(wallet);
			case 3 ->wallet = spend_money(wallet);
			case 4 ->{System.out.println("Good Bye!");
					isTrue = false;
					}
			default ->System.out.println("!INVALID CHOICE");
			}
			
		} while (isTrue);
		
		scanner.close();
		
	}
	static void show_wallet(double wallet) {
		System.out.printf("your current balance is %.2fDH\n",wallet);
	}
	static double add_money(double wallet) {
		System.out.print("How Much Money You Want To Add: ");
		double add_money = scanner.nextDouble();
		return wallet + add_money;
	}
	static double spend_money(double wallet) {
		System.out.print("How Much Money You Want To spend: ");
		double spend_money = scanner.nextDouble();
		if (spend_money>wallet) {
			System.out.println("Not Enough Money.");
			return wallet;
		}
		return wallet - spend_money;
	}

}
