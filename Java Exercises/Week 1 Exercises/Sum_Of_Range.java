package first_project;

import java.util.Scanner;

public class Sum_Of_Range {

	public static void main(String[] args) {
		
		Scanner sum = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int number = sum.nextInt();
		int total = 0;
				
		for (int i=1; i<=number; i++) {
			total +=i;		
			System.out.print(i);
			
			if (i<number) {
				System.out.print(" + ");
			}
		}
		
		System.out.println(" = " + total );

		sum.close();
	}

}
