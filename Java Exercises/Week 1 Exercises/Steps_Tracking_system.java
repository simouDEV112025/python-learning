package first_project;
import java.util.Scanner;
public class Steps_Tracking_system {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int totalsteps = 0;
		boolean check =true;
		
		do { System.out.println("=====================");
			 System.out.println("Steps Tracking System");
			 System.out.println("=====================");
			 System.out.println("1.Show total steps");
			 System.out.println("2.Add steps");
			 System.out.println("3.Reset steps");
			 System.out.println("4.Exit");
			 System.out.println("=====================");
			 System.out.print("Enter your choice: ");
			 int choice = scanner.nextInt();
			 
			 switch (choice) {
			 case 1 -> showSteps(totalsteps);
			 case 2 -> {totalsteps = addSteps(totalsteps);
				System.out.println("steps added successfuly");
			 	}
			 case 3 -> {totalsteps = resetSteps(totalsteps);
				System.out.println("steps have been reset to zero");
			 	}
			 case 4 ->{System.out.println("Good bye!");
			 			check = false;
			 		}
			 default -> System.out.println("Invalid Choice");
			 }
		} while (check);
		
		scanner.close();

	}
	static void showSteps (int totalsteps) {
		System.out.println("you steps count is: " + totalsteps + " steps");
	}
	static int addSteps (int totalsteps) {
		System.out.print("Enter the # of steps: ");
		int new_total = scanner.nextInt();
		return totalsteps + new_total;
	}
	static int resetSteps (int totalsteps) {
		return 0;
	}	
}
