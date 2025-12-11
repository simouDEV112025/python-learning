package ecommerce.model.products;

public abstract class Product {
	private String id;
	private String name;
	private double price;
	private int quantity;
	private ProductType type;

	public Product(String id, String name, double price, int quantity, ProductType type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
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

	public int getQuantity() {
		return this.quantity;
	}

	public ProductType getType() {
		return this.type;
	}

	public abstract void displaySpecs();
}
