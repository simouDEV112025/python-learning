package oop_projects;

public class Car extends Vehicle {
	private double pricePerDay;
	
	public Car(String brand, String model, double pricePerDay) {
		super(brand, model);
		this.pricePerDay = pricePerDay;
	}
	@Override
	public double getRentalPrice(int days) {
		return this.pricePerDay*days;
	}

}
