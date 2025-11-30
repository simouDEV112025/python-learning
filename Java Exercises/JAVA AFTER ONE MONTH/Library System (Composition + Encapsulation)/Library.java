package oop_projects;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	ArrayList<Book>books = new ArrayList<Book>();
	
	public void addBook(Book b) {
		books.add(b);
	}
	public Book getBookByTitle(String title) {
		Book b = null;
		for(Book book : books) {
			if(book.getTitle().equals(title)) {
				b=book;
				break;
			}
		}
		return b;
	}
	public Book getBookByAuthorName(String name) {
		Book b = null;
		for(Book book : books) {
			if(book.getAuthor().getName().equals(name)) {
				b=book;
				break;
			}
		}
		return b;
	}
	public void removeBook(String title) {
		Book b = getBookByTitle(title);
		if(b==null) {
			System.out.println("Book not found");
			return;
		}
		Iterator<Book>it = books.iterator();
		while(it.hasNext()) {
			Book book = it.next();
			if(book.getTitle().equals(title)) {
				it.remove();
			}
		}
		
	}
	public void findBooksByAuthor(String name) {
		Book b = getBookByAuthorName(name);
		if(b==null) {
			System.out.println("Book not found");
			return;
		}
		for(Book book : books) {
			if(book.getAuthor().getName().equals(name)) {
				System.out.println(book.getTitle());
			}
		}
	}
	public void printAllBooks() {
		for(Book book : books) {
			System.out.println(book);
		}
	}

}
