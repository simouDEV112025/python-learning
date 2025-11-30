package oop_projects;

public class Bike extends Vehicle{
private double pricePerDay;
	
	public Bike(String brand, String model, double pricePerDay) {
		super(brand, model);
		this.pricePerDay = pricePerDay;
	}
	@Override
	public double getRentalPrice(int days) {
		return this.pricePerDay*days;
	}

}
