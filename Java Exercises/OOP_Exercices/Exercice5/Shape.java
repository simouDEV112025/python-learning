package oop_projects;

abstract public class Shape {

	protected String color;
	public Shape(String color) {
		this.color = color;
	}
	
	abstract double getArea();
}
