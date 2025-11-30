package oop_projects;

public class Teacher extends Person {
	private double salary;
	
	public Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	public double getSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		return getName()+" "+getAge()+" "+getSalary();
	}

}
