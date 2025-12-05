package oop_projects;

public enum ProductCategory {
	FOOD(10), ELECTRONICS(20), CLOTHING(15), BOOKS(5), FURNITURE(18), TOYS(8);

	final int taxRate;

	private ProductCategory(int taxRate) {
		this.taxRate = taxRate;
	}

	public int getTaxRate() {
		return this.taxRate;
	}

}
