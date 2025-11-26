package oop_projects;

public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	@Override
	public String toString() {
		return "Title: " + getTitle() + " | Author: " + getAuthor();
	}

}
