package oop_projects;

import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();

	public User(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<Book> getBook(){
		return this.books;
	}
	@Override
	public String toString() {
		return "User: " + getName();
	}

}
