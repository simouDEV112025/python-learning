package oop_projects;

public class Main {

	public static void main(String[] args) {
		BookStore bookStore = new BookStore();
		
		Book book1 = new Book("The Let Them Theory", "Mel Robbins", 280);
		Book book2 = new Book("Sunrise on the Reaping", "Suzanne Collins", 300);
		Book book3 = new Book("Iron Flame", "Rebecca Yarros", 299.99);
		
		bookStore.addBook(book1);
		bookStore.addBook(book2);
		bookStore.addBook(book3);
		
		bookStore.printAllBooks();

	}

}
