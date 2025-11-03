package first_project;

import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		
		Scanner cd = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int number = cd.nextInt();
		int i = number;
		
		while (i>0) {
			i-=1;
		System.out.println(i);
		if (i==1) {
			System.out.println("Blast off");
			break;	
		}
		}
		
		cd.close();
	}

}
