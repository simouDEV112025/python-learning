package oop_projects;

public class Main {

	public static void main(String[] args) {
		
		Employee manager = new Manager("ismail", 20000);
		Employee dev1 = new Developer("ahmed", 15000);
		Employee dev2 = new Developer("yassin", 17000);
		
		manager.raiseSalary(0.1);
		dev1.raiseSalary(0.1);
		dev2.raiseSalary(0.1);

		System.out.println(manager);
		System.out.println(dev1);
		System.out.println(dev2);
	}

}
