package oop_projects;

public class Main {

	public static void main(String[] args) {
		
	Car car1 = new Car("Toyota", "Corolla", 2023);
	Car car2 = new Car("Honda", "Civic", 2024);
	Car car3 = new Car("Hyundai", "Tucson", 2022);
	
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(Car.numOfCars);
	}

}
