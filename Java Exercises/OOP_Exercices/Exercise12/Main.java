package oop_projects;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		School school = new School();
		
		Address a1 = new Address("Rue 16", "Rabat");
		Address a2 = new Address("Hay Mohamadi", "Casa Blanca");
		Address a3 = new Address("Mesiwa", "Beni Mellal");
		
		Student s1 = new Student("Ismail", 26, a1);
		Student s2 = new Student("Imane", 28, a2);
		Student s3 = new Student("Hamza", 34, a3);
		
		school.enrollStudent(s1);
		school.enrollStudent(s2);
		school.enrollStudent(s3);
		
		school.printAll();
	}

}
