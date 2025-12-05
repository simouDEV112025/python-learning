package oop_projects;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Repository<Integer, Product> repository = new Repository<>();
		Product milk = new Product("milk", 4.0);
		Product meat = new Product("meat", 100.0);
		Product egg = new Product("egg", 1.5);

		repository.save(00000, milk);
		repository.save(00001, meat);
		repository.save(00002, egg);

		Product p = repository.get(00000);
		if (p == null) {
			System.out.println("Product not found");
		} else {
			System.out.println(p.getName() + " -->price = " + p.getPrice() + "dh");
		}

		repository.remove(00001);

		HashMap<Integer, Product> map = repository.getRepository();

		for (Product product : map.values()) {
			System.out.println(product.getName() + " -->price = " + product.getPrice() + "dh");
		}

	}

}
