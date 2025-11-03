package first_project;

import java.util.Scanner;

public class Password_Checker {

	public static void main(String[] args) {

		Scanner pa = new Scanner(System.in);
		
		System.out.print("enter your password: ");
		String password = pa.next();
		
		if (password.equals("java123")) {
			System.out.println("Access granted");
		}
		else {
			System.out.println("Access denied");
		}
		
		pa.close();
		
		}
				
	}
	

