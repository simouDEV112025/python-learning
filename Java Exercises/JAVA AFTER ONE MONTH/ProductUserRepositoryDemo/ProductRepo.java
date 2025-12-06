package oop_projects;

import java.util.ArrayList;

public class ProductRepo extends Repository<String, Product> {

	public ArrayList<Product> findByCategory(ProductCategory cat) {
		ArrayList<Product> products = new ArrayList<>();
		if (getRepository().isEmpty()) {
			return products;
		}
		for (Product product : getRepository().values()) {
			if (product.getCategory().equals(cat)) {
				products.add(product);
			}
		}
		return products;
	}

}
