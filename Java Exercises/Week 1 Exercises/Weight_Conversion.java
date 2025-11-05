package first_project;

import java.util.Scanner;

public class Weight_Conversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double weight = 0; 

		System.out.print("weight convertion application\n\noption 1: convert kgs to lbs\noption 2: convert lbs to kgs\nchoose 1 or 2: ");
		int option = scanner.nextInt();
		
		if (option == 1) {

			System.out.print("enter your weight in kgs: ");
			weight = scanner.nextDouble();
			double kgs = weight*2.20462; 
			System.out.printf("the new weight in lbs is %.1f lbs\n", kgs);
		}
		else {
			System.out.print("enter your weight in lbs: ");
			weight = scanner.nextDouble();
			double lbs = weight*0.453592;
			System.out.printf("the new weight in kgs is %.1f kgs\n", lbs);
		}
		
		scanner.close();
	}

}
