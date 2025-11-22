package oop_projects;

public class Book {

	private String title;
	private int pages;
	private Author author;
	
	public Book(String title, int pages, Author author) {
		this.title = title;
		this.pages = pages;
		this.author = author;
	}
	
	public void printBookInfo() {
		System.out.println(this.title + " (" + this.pages +" pages )" + "'s author is " +author.getName()
										+ " and his nationality is " + author.getNationality());
	}
}
