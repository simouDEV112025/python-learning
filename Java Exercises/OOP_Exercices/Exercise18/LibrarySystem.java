package oop_projects;

import java.util.ArrayList;

public class LibrarySystem {
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public void addUser(User user) {
		users.add(user);
	}
	public void addBook(Book book) {
		books.add(book);
	}
	public void printUser() {
		for (User user : users) {
			System.out.println(user);
		}
	}
	public void printBook() {
		for (Book book : books) {
			System.out.println(book);
		}
	}
	public void borrowedBook(Book book, User user) {
		if(!books.contains(book)) {
			System.out.println( "book " + book.getTitle() +" is unavailable ⚠️ try other books Mr." + user.getName() );
			return;
		}
		books.remove(book);
		user.getBook().add(book);
	}
	public void printAll() {
		for(User user : users) {
			if(user.getBook().isEmpty()) {
				System.out.println(user + " Borrowed no books.");
			}
			else {
				System.out.println(user + " Borrowed: " + user.getBook());
			}
		}
	}
}
