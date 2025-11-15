package oop_projects;

public class Developer extends Employee{

	Developer(String name, double salary){
		super(name, salary);
	}
	
	@Override
	double calculateBonus() {
		return salary * 0.10;
	}
}

