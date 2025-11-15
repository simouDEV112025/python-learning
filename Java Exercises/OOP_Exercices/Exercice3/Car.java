package oop_projects;

public class Car {

	String brand;
	String model;
	int year;
	static int numOfCars;
	
	public Car(String brand, String model, int year){
		this.brand = brand;
		this.model = model;
		this.year = year;
		numOfCars++;
	}
	@Override
	public String toString() {
		return this.brand +" "+ this.model +" "+ this.year;
	}
}
