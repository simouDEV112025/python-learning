package oop_projects;

public abstract class Employee {

	protected String name;
	protected double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	double raiseSalary(double percent) {
		return  this.salary += (this.salary * percent);
	}
	abstract double calculateBonus();
	
	@Override
	public String toString() {
	    return name + "'s salary is " + salary + " DH and their bonus is " + calculateBonus() + " DH";
	}
}
