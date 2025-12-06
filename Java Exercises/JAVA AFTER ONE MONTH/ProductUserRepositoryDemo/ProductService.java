package oop_projects;

public class ProductService {
	Repository<String, Product> repository = new Repository<>();

	public void addProduct(String id, Product p) {
		repository.save(id, p);
	}

	public void removeProduct(String id) {
		repository.remove(id);
	}

	public void updatePrice(String id, double newPrice) {
		repository.get(id).setPrice(newPrice);
	}

	public void getExpensiveProducts(double minPrice) {
		for (Product product : repository.getRepository().values()) {
			if (product.getPrice() >= minPrice) {
				System.out.println(product);
			}
		}
	}

}
