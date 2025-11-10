package first_project;

import java.util.Scanner;

public class Student_Grade_Manager {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("how many students you want to add: ");
		int numS = scanner.nextInt();
		scanner.nextLine();
		
		String[] names = new String[numS];
		double [] grades = new double[numS];
		boolean isTrue = true;
		
		for (int i=0; i<numS; i++) {
			System.out.print("enter the name of the " + (i+1) + " student : ");
			names[i] = scanner.nextLine();
			System.out.print("enter " + names[i] + "'s grade : ");
			grades[i] = scanner.nextDouble();
			scanner.nextLine();
		}		
		do {
			menu();
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1 -> showInformation(names, grades);
			case 2 -> averageGrade(grades);
			case 3 -> highestLowestGrade(grades);
			case 4 -> searchForStudent(names);
			case 5 -> {
				System.out.println("👋👋👋👋👋");
				isTrue=false;
			}
			default -> {
				System.out.println("Invalid choice!");
			}
			}
		} while (isTrue);
		
		scanner.close();
	}
	static void menu () {
		System.out.println("**************************");
		System.out.println("Student Grade Manager");
		System.out.println("**************************");
		System.out.println("1. Show all students and grades");
		System.out.println("2. Show class average");
		System.out.println("3. Show highest and lowest grade");
		System.out.println("4. Search for a student by name");
		System.out.println("5. Exit");
		System.out.print("Enter your choice: ");
	}
	static void showInformation (String[] names, double[] grades) {
		System.out.println("");
		for (int i=0; i<grades.length; i++) {
			System.out.print("Student: " + names[i] + "     Grade: " + grades[i]+"\n");
		}
	}
	static void averageGrade (double[] grades) {
		double sum=0;
		for (int i=0; i<grades.length; i++) {
			sum+=grades[i];
		}
		double avg = sum/grades.length;
		System.out.printf("The average grade of this class is: %.2f\n" , avg);
	}
	static void highestLowestGrade (double[] grades ) {
		double highest = grades[0];
		double lowest = grades[0];
		for(int i=0; i<grades.length; i++) {
			highest = Math.max(highest, grades[i]);
			lowest = Math.min(lowest, grades[i]);
		}
		System.out.println("The highest grade in class is : " + highest + "\nthe lowest grade is : " + lowest);
	}
	static void searchForStudent(String[] names) {
		boolean isFound = false;
		System.out.print("Enter the student's name: ");
		String searchName = scanner.nextLine().toLowerCase();
		 for(int i=0; i<names.length; i++) {
			if(names[i].equals(searchName)) {
				 System.out.println(searchName + " is in this class");
				 isFound = true;
			}
		}
			if(!isFound) {
				System.out.println(searchName + " was not found");
			}
	}
}
