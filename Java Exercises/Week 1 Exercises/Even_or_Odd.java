package first_project;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nm = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int number = nm.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Even");
		}
		
		else {
			System.out.println("Odd");
		}
		
		nm.close();
	}

}
