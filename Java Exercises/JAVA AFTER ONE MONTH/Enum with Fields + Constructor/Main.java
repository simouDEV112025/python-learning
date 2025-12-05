package oop_projects;

public class Main {
	public static void main(String[] args) {

		for (ProductCategory p : ProductCategory.values()) {
			System.out.println(p + " " + p.getTaxRate() + "%");
		}

	}

}
