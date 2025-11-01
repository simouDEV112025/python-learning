package first_project;

import java.util.Scanner;

public class Loop_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lp = new Scanner(System.in);
		
		String name = "";
		
		while (name.equals("")) {
			System.out.print("enter your name: ");
			name = lp.nextLine().trim();
		}

		System.out.println("hi, " + name + "!");
		
		lp.close();
		 
	}

}
