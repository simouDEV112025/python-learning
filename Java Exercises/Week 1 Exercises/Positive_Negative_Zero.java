package first_project;

import java.util.Scanner;

public class Positive_Negative_Zero {

	public static void main(String[] args) {
		
		Scanner pn = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int number = pn.nextInt();
		
		if (number > 0) {
			System.out.println( number + " is positive");	
		}
		
		else if (number < 0) {
			System.out.println( number + " is negative");	
		}
		
		else {
			System.out.println("Zero");	
		}
		
		pn.close();
	}

}
