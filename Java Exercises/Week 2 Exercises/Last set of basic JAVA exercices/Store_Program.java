package first_project;

import java.util.Scanner;

public class Store_Program {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		double balance = 100;
		boolean isruning = true;
		int item = 0;
		boolean isSuccusseful = false;
		
		do {
			isSuccusseful = false;
			System.out.println("* * * * * * * * * *");
			System.out.println("Welcom to my store");
			System.out.println("* * * * * * * * * *");
			System.out.println("1. Show Balance");
			System.out.println("2. Add Money");
			System.out.println("3. Buy Item");
			System.out.println("4. Exit");
			System.out.println("* * * * * * * * * *");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1-> showBalance(balance);
			case 2-> balance = addMoney(balance);
			case 3-> balance = buyItem(balance);
			case 4-> {System.out.println("Good bye!");
					isruning = false;;
			}
			default-> System.out.println("Invalid choice");
			}
		} while (isruning);
		
		scanner.close();

	}
	static void showBalance (double balance) {
		System.out.printf("\n%.2fDH\n\n",balance);
	}
	static double addMoney (double balance) {
		System.out.print("\nAdd money: ");
		double add = scanner.nextDouble();
		System.out.println("\nMoney added\n");
		return balance + add;
	}
	static double buyItem ( double balance) {
		double newbalance = balance;
		System.out.println("\n1.Chocolate (15DH)");
		System.out.println("2.Book (30)");
		System.out.print("choose the item you want to buy: ");
		int choice1 =scanner.nextInt();
		 switch(choice1) {
		case 1 -> {if (balance<15) {
			System.out.println("\nCan't buy item, not enough balance\n");
			}
		else {
			System.out.println("\nThank you for you purchase\n");
							newbalance= balance - 15;
				}
		}	
	    case 2 -> {if (balance<30) {
			System.out.println("\nCan't buy item, not enough balance\n");
			}	
		else {
			System.out.println("\nThank you for you purchase\n");
							newbalance =  balance - 30;
				}
	    	}
	    default -> System.out.println("\nInvalid choice!\n");
	    }
		 return newbalance;
	}
}

