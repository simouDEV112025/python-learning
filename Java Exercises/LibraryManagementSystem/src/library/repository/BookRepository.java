package library.repository;

import java.util.Collection;

import library.model.Book;

public class BookRepository {
	private Repository<String, Book> repository = new Repository<>();

	public void addBook(String id, Book b) {
		repository.save(id, b);
	}

	public void removeBook(String id) {
		repository.delete(id);
	}

	public Book getBook(String id) {
		return repository.find(id);
	}

	public Collection<Book> getAllBooks() {
		return repository.findAll();
	}

	public void update(String id, Book b) {
		repository.update(id, b);
	}

}
