package oop_projects;

public class Intern extends Employee {
	private int durationMonths;
	
	public Intern(String name, double salary, int durationMonths) {
		super(name, salary);
		this.durationMonths = durationMonths;
	}
	public int getDurationMonths() {
		return this.durationMonths;
	}

}
