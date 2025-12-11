package ecommerce.model.products;

public class Laptop extends Product {
	private int ram;
	private int storage;

	public Laptop(String id, String name, double price, int quantity, ProductType type, int ram, int storage) {
		super(id, name, price, quantity, type);
		this.ram = ram;
		this.storage = storage;
	}

	public int getRam() {
		return this.ram;
	}

	public int getStorage() {
		return this.storage;
	}

	@Override
	public void displaySpecs() {
		System.out.println("Laptop Details:");
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Price: $" + getPrice());
		System.out.println("Quantity: " + getQuantity());
		System.out.println("Type: " + getType());
		System.out.println("RAM: " + ram + "GB");
		System.out.println("Storage: " + storage + "GB");
		System.out.println("-------------------------");
	}

}
