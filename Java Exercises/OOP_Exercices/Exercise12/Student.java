package oop_projects;

public class Student {
	private String name;
	private int age;
	private Address address;
	
	public Student(String name, int age, Address address) {
		this.name = name;
		this.age =age;
		this.address = address;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public Address getAddress() {
		return this.address;
	}
	@Override
	public String toString() {
		return "Name: " + getName() + " | Age: " + getAge() +
				   " | City: " + getAddress().getCity() + " | Street: " + getAddress().getStreet();
	}
}
