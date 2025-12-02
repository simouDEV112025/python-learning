package oop_projects;

public class Manager extends Employee implements BonusEligible {
	private double bonus;
	
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	public double getBonus() {
		return this.bonus;
	}
	public double calculateBonus() {
		double newSlaray = getSalary()+getBonus();
		return newSlaray;
	}

}
