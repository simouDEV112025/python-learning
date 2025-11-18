package oop_projects;

public class Book {
	
	protected String title;
	protected String author;
	protected int pages;
	protected boolean isBorrowed;
	
	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		isBorrowed = false;
	}
	public void borrow() {
		if (isBorrowed) {
			System.out.println("Already borrowed");
		}
		else {
			isBorrowed = true;
		}
	}
	public void returnBook() {
		if (!isBorrowed) {
			System.out.println("Book was not borrowed");
		}
		else {
			isBorrowed = false;
		}
	}
	@Override
	public String toString() {
		return "Title: " + this.title + " | " + "Author: " + this.author + " | " + "pages : " + this.pages + " | " + "Borrowed: " + isBorrowed;
	}
}
