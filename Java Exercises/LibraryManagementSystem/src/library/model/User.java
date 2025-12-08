package library.model;

import java.util.ArrayList;

public class User {
	private String id;
	private String username;
	private ArrayList<Book> borrowedBooks = new ArrayList<>();

	public User(String id, String username) {
		this.id = id;
		this.username = username;
	}

	public String getId() {
		return this.id;
	}

	public String getUsername() {
		return this.username;
	}

	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void borrowBook(Book b) {
		if (!b.getIsBorrowed()) {
			borrowedBooks.add(b);
			b.borrowBook();
		} else {
			System.out.println("Book already borrowed");
		}
	}

	public void returnBook(Book b) {
		if (borrowedBooks.contains(b)) {
			borrowedBooks.remove(b);
			b.returnBook();
		} else {
			System.out.println("Book not found");
		}
	}

	@Override
	public String toString() {
		return getId() + " " + getUsername();
	}

}
