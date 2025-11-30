package oop_projects;

public class Book {
	private Author author;
	private String title;
	
	public Book(Author author, String title) {
		this.author = author;
		this.title = title;
	}
	public Author getAuthor() {
		return this.author;
	}
	public String getTitle() {
		return this.title;
	}
	@Override
	public String toString() {
		return getAuthor().getName()+" | Book: "+getTitle();
	}

}
