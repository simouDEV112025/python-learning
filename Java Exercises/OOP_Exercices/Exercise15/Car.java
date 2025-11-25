package oop_projects;

public class Car {
	private String brand;
	private String model;
	private int year;
	private double price;
	
	public Car(String brand, String model, int year, double price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getBrand() {
		return this.brand;
	}
	public String getModel() {
		return this.model;
	}
	public int getYear() {
		return this.year;
	}
	public double getPrice() {
		return this.price;
	}
	@Override
	public String toString() {
		return "Brand: " + getBrand() + " | Model: " + getModel()
					+ " | Year: " + getYear() + " | Price: " + getPrice() + "DH";
	}

}
