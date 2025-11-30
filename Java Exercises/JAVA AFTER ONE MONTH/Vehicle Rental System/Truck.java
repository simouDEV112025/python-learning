package oop_projects;

public class Truck extends Vehicle {
private double pricePerDay;
	
	public Truck(String brand, String model, double pricePerDay) {
		super(brand, model);
		this.pricePerDay = pricePerDay;
	}
	@Override
	public double getRentalPrice(int days) {
		return this.pricePerDay*days;
	}

}
