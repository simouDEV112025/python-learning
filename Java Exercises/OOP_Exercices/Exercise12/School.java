package oop_projects;

import java.util.ArrayList;

public class School {
	private ArrayList<Student> students= new ArrayList<>();
	
	public void enrollStudent(Student student) {
		students.add(student);
	}
	public void printAll() {
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
