package library.model;

public class Book {
	private String id;
	private String title;
	private BookCategory category;
	private boolean isBorrowed = false;

	public Book(String id, String title, BookCategory category) {
		this.id = id;
		this.title = title;
		this.category = category;
	}

	public String getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public BookCategory getCategory() {
		return this.category;
	}

	public boolean getIsBorrowed() {
		return isBorrowed;
	}

	public void borrowBook() {
		isBorrowed = true;
	}

	public void returnBook() {
		isBorrowed = false;
	}

	@Override
	public String toString() {
		return getId() + " " + getTitle() + " " + getCategory();
	}

}
