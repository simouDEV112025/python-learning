package first_project;

import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ag = new Scanner(System.in);
		System.out.print("enter your age: ");
		int age = ag.nextInt();
		if (age >= 18) {
			System.out.println("adult");
		}
		
		else {
			System.out.println("minor");
		}
				
		ag.close();
		
	}

}
