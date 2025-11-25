package oop_projects;

public class Car {
	private String model;
	private Engine engine;
	
	public Car(String model, int power, String type) {
		this.model = model;
		this.engine = new Engine(power, type);
	}
	public String getModel() {
		return this.model;
	}
	public Engine getEngine() {
		return this.engine;
	}
	@Override
	public String toString() {
		return "Car Model: " + getModel() + " | Engine Power: " + getEngine().getPower()
					+ " | Engine Type: " + getEngine().getType();
	}

}
