package first_project;

import java.util.Scanner;

public class Grade_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a score: ");
		int score = sc.nextInt();
		
		if (score <= 100 && score >= 90) {
			System.out.println("A");
		}
		else if (score <= 89 && score >= 80) {
			System.out.println("B");
		}
		else if (score <= 79 && score >= 70) {
			System.out.println("C");
		}
		else if (score <= 69 && score >= 60) {
			System.out.println("D");
		}
		else if (score <= 59 && score >= 0) {
			System.out.println("F");
		}
		sc.close();
	}

}
