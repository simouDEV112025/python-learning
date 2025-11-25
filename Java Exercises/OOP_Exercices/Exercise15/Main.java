package oop_projects;

public class Main {

	public static void main(String[] args) {
		CarInventory carInventory = new CarInventory();
		
		Car car1 = new Car("Nissan", "Leaf", 2025, 277000);
		Car car2 = new Car("Toyota", "Sienna", 2017, 385000);
		Car car3 = new Car("Buick", "Envision", 1989, 367000);
		
		carInventory.addCar(car1);
		carInventory.addCar(car2);
		carInventory.addCar(car3);
		
		carInventory.removeCar("Toyota", "Sienna");
		
		System.out.println("The oldest car is : " + carInventory.oldestCar().getBrand()+ " " + carInventory.oldestCar().getModel()+"\n");
		
		
		carInventory.printCars();

	}

}
 