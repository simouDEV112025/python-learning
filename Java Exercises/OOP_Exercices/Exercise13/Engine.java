package oop_projects;

public class Engine {
	private int power;
	private String type;
	
	public Engine(int power, String type) {
		this.power = power;
		this.type = type;
	}
	public int getPower() {
		return this.power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getType() {
		return this.type;
	}

}
