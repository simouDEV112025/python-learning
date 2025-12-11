package ecommerce.service;

import java.util.Collection;
import java.util.Iterator;

import ecommerce.model.products.Product;
import ecommerce.model.products.ProductType;
import ecommerce.model.users.Admin;
import ecommerce.model.users.User;
import ecommerce.repository.ProductRepository;

public class ProductService {
	private ProductRepository productRepository = new ProductRepository();

	public void addProduct(User user, String id, Product product) {
		if (!(user instanceof Admin)) {
			System.out.println("Permission denied");
			return;
		}
		productRepository.addProduct(id, product);
	}

	public void updateProduct(User user, String id, Product newProduct) {
		if (!(user instanceof Admin)) {
			System.out.println("Permission denied");
			return;
		}
		if (productRepository.getProduct(id) == null) {
			System.out.println("Product not found");
			return;
		}
		productRepository.update(id, newProduct);
	}

	public void removeProduct(User user, String id) {
		if (!(user instanceof Admin)) {
			System.out.println("Permission denied");
			return;
		}
		if (productRepository.getProduct(id) == null) {
			System.out.println("Product not found");
			return;
		}
		productRepository.removeProduct(id);
	}

	public Product searchByName(String name) {
		Collection<Product> list = productRepository.getAllProducts();
		Iterator<Product> it = list.iterator();
		while (it.hasNext()) {
			Product p = it.next();
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	public Product searchByType(ProductType type) {
		Collection<Product> list = productRepository.getAllProducts();
		Iterator<Product> it = list.iterator();
		while (it.hasNext()) {
			Product p = it.next();
			if (p.getType().equals(type)) {
				return p;
			}
		}
		return null;
	}

}
