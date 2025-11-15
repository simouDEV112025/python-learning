package oop_projects;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
	}
	@Override
	void describe(){
		System.out.println(this.name + " is a student and he is " + this.age + " years old.");
	}
}
