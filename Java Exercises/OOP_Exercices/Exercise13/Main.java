package oop_projects;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Koenigsegg Jesko Absolut", 1280, "twin-turbocharged V8");
		Car car2 = new Car("Bugatti Tourbillon", 1800, "naturally-aspirated V16");
		Car car3 = new Car("Dodge Challenger SRT Demon 170", 1025, "supercharged HEMI V8");
		
		car1.getEngine().setPower(1400);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);

	}

}
