package first_project;

import java.util.Scanner;

import java.util.Random;

public class Java_Slot_Machine {
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int balance = 100;
		int bet = 0;
		int win = 0;
		boolean isGoing = true;
		String[] emojis = {"🍒", "🍉", "🍋", "🔔", "⭐"};
		String choice = null;
		
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		System.out.println("     Welcome to java slots     ");
		System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
		System.out.println("- - - - - - - - - - - - - - - - - - -");

		 while (isGoing && balance>0) {
			System.out.printf("Current balance: %dDH\n", balance);
			System.out.print("Place your bet amount: ");
			bet = scanner.nextInt();
			if (bet<balance && bet>0) {
				balance = amountBet(balance, bet);
				System.out.println("Spinning . . . ");
				balance +=getEmojis(bet, emojis);
				}
			else {
				System.out.println("Invalid operation!\n");
				continue;
			}
		System.out.print("do you want to play again (Y/N): ");
		choice = scanner.next().toUpperCase();
		if (choice.equals("N")) {
			System.out.println("GAME OVER! Your finale balance is " + balance +"DH");
			isGoing=false;
			}
		}		
			scanner.close();
	}
	static int amountBet (int balance, int bet  ) {
		return balance - bet;
	}
	static int getEmojis (int bet, String... emojis) {
		String spin1 = emojis[random.nextInt(emojis.length)];
		String spin2 = emojis[random.nextInt(emojis.length)];
		String spin3 = emojis[random.nextInt(emojis.length)];
		System.out.println("* * * * * * *");
		System.out.println(spin1 +"|"+ spin2 +"|"+ spin3);
		System.out.println("* * * * * *  *");
		if (spin1.equals(spin2) && spin1.equals(spin3)) {
			System.out.println("you won " +bet*3+ "DH");
			return bet*3;
		}
		else if(spin1.equals(spin2) || spin1.equals(spin3) || spin2.equals(spin3)) {
			System.out.println("you won " +bet*2+ "DH");
			return bet*2;
		}
		else {
			System.out.println("sorry you lost this round");
			return 0;
		}
	}
}
