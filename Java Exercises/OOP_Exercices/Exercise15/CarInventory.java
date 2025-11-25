package oop_projects;

import java.util.ArrayList;

public class CarInventory {
	private ArrayList<Car> cars = new ArrayList<Car>();
	
	public void addCar(Car car) {
		this.cars.add(car);
	}
	public void removeCar(String brand, String model) {
		for(Car car : cars) {
			if(car.getModel().equals(model) && car.getBrand().equals(brand)) {
				cars.remove(car);
			}
		}
	}
	public Car oldestCar() {
		Car oldestCar = cars.get(0);
		for(int i=0; i<cars.size(); i++) {
			if(cars.get(i).getYear()<= oldestCar.getYear()) {
				oldestCar = cars.get(i);
			}
		}
		return oldestCar;
	}
	public void printCars() {
		for(Car car : cars) {
			System.out.println(car);
		}
	}

}
