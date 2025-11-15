package oop_projects;

public class Rectangle extends Shape {

	double width;
	double height;
	
	public Rectangle(String color, double width, double height) {
		super(color);
		this.height = height;
		this.width = width;
	}
	@Override
	double getArea() {
		return this.height * this.width;
	}
}
