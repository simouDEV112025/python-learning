package oop_projects;

import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<Computer>computers = new ArrayList<Computer>();
	
	public User(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	public void printAll() {
		for(Computer computer : computers) {
			System.out.println(getName()+" has a computer with a "+computer);
		}	
	}

}
