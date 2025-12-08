package library.app;

import library.model.Book;
import library.model.BookCategory;
import library.service.LibraryService;

public class Main {

	public static void main(String[] args) {
		LibraryService library = new LibraryService();

		library.addBook("The Hobbit", BookCategory.FANTASY);
		library.addBook("A Brief History of Time", BookCategory.SCIENCE);
		library.addBook("1984", BookCategory.FICTION);

		library.addUser("Alice");
		library.addUser("Bob");

		library.borrowBook("U1", "B1");
		library.borrowBook("U2", "B2");
		library.borrowBook("U1", "B3");

		library.borrowBook("U2", "B1");

		library.returnBook("U1", "B1");

		Book searchTitle = library.searchByTitle("1984");
		System.out.println("Search by title '1984': " + (searchTitle != null ? searchTitle : "Not found"));

		Book searchCategory = library.searchByCategory(BookCategory.SCIENCE);
		System.out.println("Search by category SCIENCE: " + (searchCategory != null ? searchCategory : "Not found"));

		int totalBorrowed = library.totalBorrowedBooks();
		System.out.println("Total borrowed books: " + totalBorrowed);

		library.removeBook("B2");

		library.removeBook("B5");

		System.out.println("Test completed!");
	}
}
