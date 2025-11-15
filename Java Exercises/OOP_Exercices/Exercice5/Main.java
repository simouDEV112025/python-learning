package oop_projects;

public class Main {

	public static void main(String[] args) {
		
		Shape[] shapes = {new Circle("red", 7.5), new Circle("blue", 6.6),
									  new Rectangle("black", 3, 7.4), new Rectangle("white", 8.1, 17.91)};
		for (Shape shape : shapes) {
			System.out.print(shape.color + " ");
			System.out.printf("%.2fcm²\n" ,shape.getArea());
		}
		
	}

}
