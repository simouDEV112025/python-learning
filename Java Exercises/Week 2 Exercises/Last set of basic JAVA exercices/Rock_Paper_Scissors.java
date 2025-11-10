package first_project;

import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] choices = {"rock","paper","scissors"};
		boolean isRuning = true;
		
		do {
			System.out.print("Enter your move (rock,paper,scissors): ");
			String move = scanner.nextLine().toLowerCase();
			String choice = choices[random.nextInt(choices.length)];
			if(!move.equals("rock") && !move.equals("paper") && !move.equals("scissors")) {
				System.out.println("Invalid move");
				continue;
			}
			System.out.println("Computer choice: " + choice);
			if(move.equals(choice)) {
				System.out.println("Draw!");
			}
			else if(move.equals("rock") && choice.equals("scissors")) {
				System.out.println("You win!");
			}
			else if(move.equals("rock") && choice.equals("paper")) {
				System.out.println("You lose!");
			}
			else if(move.equals("paper") && choice.equals("scissors")) {
				System.out.println("You lose!");
			}
			else if(move.equals("paper") && choice.equals("rock")) {
				System.out.println("You win!");
			}
			else if(move.equals("scissors") && choice.equals("paper")) {
				System.out.println("You win!");
			}
			else if(move.equals("scissors") && choice.equals("rock")) {
				System.out.println("You lose!");
			}
			System.out.print("Play again (yes/no): ");
			String play = scanner.nextLine().toLowerCase();
			if(play.equals("no")) {
				System.out.println("Thank you for playing!");
				isRuning = false;
			}
			}while (isRuning);
		
		scanner.close();
	}

}
