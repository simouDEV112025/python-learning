package ecommerce.model.products;

public class Phone extends Product {
	private double screenSize;
	private int battery;

	public Phone(String id, String name, double price, int quantity, ProductType type, double screenSize, int battery) {
		super(id, name, price, quantity, type);
		this.screenSize = screenSize;
		this.battery = battery;
	}

	public double getScreenSize() {
		return this.screenSize;
	}

	public int getBattery() {
		return this.battery;
	}

	@Override
	public void displaySpecs() {
		System.out.println("Phone Details:");
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Price: $" + getPrice());
		System.out.println("Quantity: " + getQuantity());
		System.out.println("Type: " + getType());
		System.out.println("Screen Size: " + screenSize + " inches");
		System.out.println("Battery: " + battery + "mAh");
		System.out.println("-------------------------");
	}

}
