package oop_projects;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return this.price;
	}
	@Override
	public String toString() {
		return "The Book: " + getTitle() + " | Author: " + getAuthor() + " | Price: " + getPrice() + "DH";
	}

}
