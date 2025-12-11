package ecommerce.repository;

import java.util.Collection;

import ecommerce.model.products.Product;

public class ProductRepository extends Repository<String, Product> {

	public void addProduct(String id, Product product) {
		save(id, product);
	}

	public void removeProduct(String id) {
		delete(id);
	}

	public Product getProduct(String id) {
		return find(id);
	}

	public Collection<Product> getAllProducts() {
		return findAll();
	}

	public void updateProduct(String id, Product newProduct) {
		update(id, newProduct);
	}

}
