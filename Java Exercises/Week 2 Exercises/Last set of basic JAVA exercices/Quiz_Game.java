package first_project;

import java.util.Scanner;

public class Quiz_Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] questions = {"What is the main function of a router?",
							  "Which part of the computer is considered the brain?",
							  "What year was Facebooc lunched?",
							  "Who is known as the father of computers?",
							  "What was the first programming language? "};
		String[][] options = {{"1. Storing files","2. Encrypting data","3. Directing internet","4. Managing passwords"},
							 {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
							 {"1. 2000","2. 2004","3. 2006","4. 2010"},
							 {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Baddage"},
							 {"1. COBOL","2. C","3. Fortran","4. Assembly"}};
		
		int[] ansewrs = {3,1,2,4,3};
		int score = 0;

		System.out.println("= = = = = = = = =  = = = = = =");
		System.out.println("Welcome to the java quiz game!");
		System.out.println("= = = = = = = = =  = = = = = =\n");

		for(int i=0; i<questions.length; i++) {
			System.out.println(questions[i]);
			for(int j=0; j<options[i].length; j++) {
				System.out.println(options[i][j]);
			}
				System.out.print("Enter your guess: ");
				int guess = scanner.nextInt();
				if(guess==ansewrs[i]) {
							System.out.println("--------");
							System.out.println("CORRECT!");
							System.out.println("--------");
							score+=1;
						}
						else {
							System.out.println("-------");
							System.out.println(" WRONG ");
							System.out.println("-------");
						}
					}
		System.out.println("===========================================");
		System.out.println("Your final score is: " + score + " out of 5");
		System.out.println("===========================================");

		scanner.close();
		}
}
