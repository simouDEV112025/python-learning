package oop_projects;

public class Owner {
		String name;
		int age;
		Car car;
		
	public Owner (String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	public void printInfo() {
		System.out.println(this.name + " who is " + this.age + " has a " + car.year + " " + car.model + " with a " + car.engine.type + " engine");
	}

}
