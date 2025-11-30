package oop_projects;

public abstract class Vehicle {
	protected String brand;
	protected String model;
	
	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	public abstract double getRentalPrice(int days);

}
