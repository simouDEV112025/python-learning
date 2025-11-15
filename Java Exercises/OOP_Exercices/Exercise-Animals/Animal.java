package oop_projects;

public abstract class Animal {
	
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	void printName() {
		System.out.print(this.name);
	}
	abstract String sound();
	
	@Override
	public String toString() {
		return sound() + " is the sound that " + this.name + " makes";
	}
		

}
