package first_project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner cl = new Scanner(System.in);
	
	System.out.print("enter first number x: ");
	int x = cl.nextInt();
	
	System.out.print("enter secand number y: ");
 	int y = cl.nextInt();
 	
 	System.out.println("sum: " + ( x + y ) );
 	System.out.println("difrence: " + ( x - y ) );
 	System.out.println("product: " + ( x * y ) );
 	System.out.print("division: " +  (double) x / y );
 	
 	cl.close();
	}

}
