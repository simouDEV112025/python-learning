package library.service;

import library.model.Book;
import library.model.BookCategory;
import library.model.User;
import library.repository.BookRepository;
import library.repository.UserRepository;

public class LibraryService {
	private BookRepository books = new BookRepository();
	private UserRepository users = new UserRepository();
	private int nextBookId = 1;
	private int nextUserId = 1;

	public void addBook(String title, BookCategory category) {
		String id = ("B" + nextBookId);
		Book book = new Book(id, title, category);
		books.addBook(id, book);
		nextBookId++;
	}

	public void removeBook(String id) {
		if (books.getBook(id) == null) {
			System.out.println("Book not found");
		} else {
			books.removeBook(id);
		}
	}

	public Book searchByTitle(String title) {
		for (Book b : books.getAllBooks()) {
			if (b.getTitle().equals(title)) {
				return b;
			}
		}
		return null;
	}

	public Book searchByCategory(BookCategory category) {
		for (Book b : books.getAllBooks()) {
			if (b.getCategory().equals(category)) {
				return b;
			}
		}
		return null;
	}

	public void addUser(String username) {
		String id = "U" + nextUserId;
		User user = new User(id, username);
		users.addUser(id, user);
		nextUserId++;
	}

	public void borrowBook(String userId, String bookId) {
		User user = users.getUser(userId);
		Book book = books.getBook(bookId);
		if (user == null) {
			System.out.println("User not found");
			return;
		}
		if (book == null) {
			System.out.println("Book not found");
			return;
		}
		user.borrowBook(book);
	}

	public void returnBook(String userId, String bookId) {
		User user = users.getUser(userId);
		Book book = books.getBook(bookId);
		if (user == null) {
			System.out.println("User not found");
			return;
		}
		if (book == null) {
			System.out.println("Book not found");
			return;
		}
		user.returnBook(book);

	}

	public int totalBorrowedBooks() {
		int sum = 0;
		for (User user : users.getAllUsers()) {
			sum += user.getBorrowedBooks().size();
		}
		return sum;
	}

}
