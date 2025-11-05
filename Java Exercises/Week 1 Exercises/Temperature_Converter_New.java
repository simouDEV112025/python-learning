package first_project;

import java.util.Scanner;

public class Temperature_Converter_New {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the temparature: ");
		double temp = scanner.nextDouble();
		
		System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
		String f_c = scanner.next().toUpperCase();
		
		double newtemp = (f_c.equals("F")) ? (temp * 9/5) + 32 : (temp - 32) * 5/9 ;
		
		 System.out.printf("%.2f%s",newtemp, f_c);
		
		scanner.close();
	}

}
