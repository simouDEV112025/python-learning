package oop_projects;

public class CPU {
	private double speed;
	private int cores;
	
	public CPU(double speed, int cores) {
		this.speed = speed;
		this.cores = cores;
	}
	public double getSpeed() {
		return this.speed;
	}
	public int getCores() {
		return this.cores;
	}

}
