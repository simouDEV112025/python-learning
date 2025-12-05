package oop_projects;

public class Main {

	public static void main(String[] args) {
		Repository<String, Product> repository = new Repository<>();

		Result<Product> results = new Result<>();

		Product arganOil = new Product("Argan Oil (100ml)", 150.0);
		Product mintTea = new Product("Mint Tea (500g)", 45.0);
		Product couscous = new Product("Couscous (1kg)", 25.0);
		Product leatherBabouche = new Product("Leather Babouche", 120.0);

		repository.save("1010", arganOil);
		repository.save("2020", mintTea);
		repository.save("3030", couscous);
		repository.save("4040", leatherBabouche);

		repository.update("3030", new Product("Milk (500ml)", 4.0));

		Product product = repository.get("3030");

		if (product == null) {
			System.out.println("Product not found");
		} else {
			System.out.println(product.getName());
		}
		if (product == null) {
			System.out.println("Product not found");
		} else {
			results.add(product);
		}
		for (Product p : results.getResult()) {
			System.out.println(p);
		}

	}

}
