package oop_projects;

public class Product {
	private String id;
	private String name;
	private double price;
	private ProductCategory category;

	public Product(String id, String name, double price, ProductCategory category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public ProductCategory getCategory() {
		return this.category;
	}

	@Override
	public String toString() {
		return getName() + " " + getPrice();
	}

}
