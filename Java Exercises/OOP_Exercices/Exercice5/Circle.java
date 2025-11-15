package oop_projects;

public class Circle extends Shape {

	double radius;
	
	public Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	@Override
	double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
