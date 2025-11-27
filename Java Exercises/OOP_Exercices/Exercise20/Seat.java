package oop_projects;

public class Seat {
	private int number;
	private boolean isBooked = false;
	
	public Seat(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
	public boolean getIsBooked() {
		return isBooked;
	}
	public void book() {
		isBooked = true;
	}
	public void cancel() {
		isBooked = false;
	}
	@Override
	public String toString() {
		return "Seat number is: " + getNumber();
	}

}
