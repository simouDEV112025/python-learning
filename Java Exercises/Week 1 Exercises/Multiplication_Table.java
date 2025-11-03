package first_project;

import java.util.Scanner; 

class Multiplication_Table {

	public static void main(String[] args) {

			Scanner mt = new Scanner(System.in);
			
			System.out.print("enter a number: ");
			int number = mt.nextInt();
			
			for (int i=1; i<=10; i++) {
				System.out.println(number + "x" + i + "=" + number*i);
			}
			
			mt.close();
	}

}
