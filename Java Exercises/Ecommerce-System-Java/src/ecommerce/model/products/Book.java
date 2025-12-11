package ecommerce.model.products;

public class Book extends Product {
	private String author;
	private int pages;

	public Book(String id, String name, double price, int quantity, ProductType type, String author, int pages) {
		super(id, name, price, quantity, type);
		this.author = author;
		this.pages = pages;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getPages() {
		return this.pages;
	}

	@Override
	public void displaySpecs() {
		System.out.println("Book Details:");
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Price: $" + getPrice());
		System.out.println("Quantity: " + getQuantity());
		System.out.println("Type: " + getType());
		System.out.println("Author: " + author);
		System.out.println("Pages: " + pages);
		System.out.println("-------------------------");
	}

}
