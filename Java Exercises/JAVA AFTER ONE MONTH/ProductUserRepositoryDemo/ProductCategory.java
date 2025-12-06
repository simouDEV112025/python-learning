package oop_projects;

public enum ProductCategory {
	BEAUTY(20), HOMEWARE(10), ACCESSORIES(20), KITCHENWARE(20);

	private int taxRate;

	private ProductCategory(int taxRate) {
		this.taxRate = taxRate;
	}

	public int getTaxRate() {
		return this.taxRate;
	}
}
