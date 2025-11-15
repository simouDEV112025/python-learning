package oop_projects;

public class Main {

	public static void main(String[] args) {
		Animal dog1 = new Dog("A");
		Animal dog2 = new Dog("B");
		Animal cat1 = new Cat("C");
		Animal cat2 = new Cat("D");
		
		Animal[] animals = {dog1, dog2, cat1, cat2};
		
		for(Animal animal : animals) {
		System.out.println(animal);	
		}

	}

}
