package first_project;

import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int min = 0;
		int max = 100;
		int RandomNumber = random.nextInt(min, max +1);
		int attempts = 0;
		int guess = 0;
		
		System.out.printf("Number Guessing Game\nGuess a number between %d-%d\n\n",min, max);
		
		while(guess != RandomNumber) {
			System.out.print("Enter a number: ");
			guess = scanner.nextInt();
			attempts++;
			
			if (guess < RandomNumber) {
				System.out.println("!TOO LOW, try again");
			}
			else if (guess > RandomNumber) {
				System.out.println("!TOO HIGH, try again");
			}
			else {
				System.out.println("\n!CORRECT, it took you " + attempts + " attempts to guess the number\nTHANK YOU FOR PARTICIPATING IN THE GAME");
			}
		}
		
		scanner.close();
		
	}

}
