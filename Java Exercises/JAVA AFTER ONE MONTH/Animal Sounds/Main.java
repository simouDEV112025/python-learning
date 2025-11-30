package oop_projects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	ArrayList<Animal> animals = new ArrayList<Animal>();
    	Animal dog = new Dog();
    	Animal cat = new Cat();
    	animals.add(cat);
    	animals.add(dog);
    	for(Animal animal : animals) {
    		animal.makeSound();
    	}
       
    }
}
