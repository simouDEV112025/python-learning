package oop_projects;

public abstract class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	abstract void describe();
	@Override
	public String toString() {
		return this.name + " is a student and he is " + this.age + " years old.";
	}
}
