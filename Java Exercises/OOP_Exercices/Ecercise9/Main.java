package oop_projects;

public class Main {

	public static void main(String[] args) {
			Car car = new Car("dacia", 2020, "v6");
			Owner owner = new Owner("ismail", 26, car);
			
			owner.printInfo();
	}
			
}
