package oop_projects;

public class Manager extends Employee {
	
	Manager(String name, double salary){
		super(name, salary);
	}

	@Override
	double calculateBonus() {
		return salary * 0.20;
	}
}
