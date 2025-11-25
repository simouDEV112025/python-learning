package oop_projects;

import java.util.ArrayList;

public class BookStore {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	public void printAllBooks() {
		for(Book book : books) {
			System.out.println(book);
		}
	}

}
