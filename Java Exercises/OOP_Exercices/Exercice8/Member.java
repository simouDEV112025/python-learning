package oop_projects;

public class Member {
	
	protected String name;
	int borrowedBooksCount;
	
	public Member(String name) {
		this.name = name;
	}
	public void borrowBook(Book b) {
	if (b.isBorrowed) {
		System.out.println("Cannot borrow this book");
	}
	else {
		b.borrow();
		borrowedBooksCount++;
	}
	}
	public void returnBook(Book b) {
	if (!b.isBorrowed) {
		System.out.println("Cannot return this book");
	}
	else {
		b.returnBook();
		borrowedBooksCount--;
	}
	}
}
