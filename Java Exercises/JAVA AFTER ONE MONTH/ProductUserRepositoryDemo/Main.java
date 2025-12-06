package oop_projects;

public class Main {
	public static void main(String[] args) {
		// --- Test Products ---
		Product p1 = new Product("101", "Argan Oil", 180.0, ProductCategory.BEAUTY);
		Product p2 = new Product("102", "Mint Tea", 350.0, ProductCategory.HOMEWARE);

		// ProductRepo
		ProductRepo productRepo = new ProductRepo();
		productRepo.save("101", p1);
		productRepo.save("102", p2);

		System.out.println("Products in BEAUTY category:");
		System.out.println(productRepo.findByCategory(ProductCategory.BEAUTY));

		// ProductService
		ProductService productService = new ProductService();
		productService.addProduct("101", p1);
		productService.addProduct("102", p2);
		System.out.println("\nExpensive products (>=200):");
		productService.getExpensiveProducts(200);

		// --- Test Users ---
		User u1 = new User(1, "Alice", "alice@mail.com");
		User u2 = new User(2, "Bob", "bob@mail.com");

		UserRepository userRepo = new UserRepository();
		userRepo.addUser("1", u1);
		userRepo.addUser("2", u2);

		System.out.println("\nUsers starting with A:");
		userRepo.printUserByLetter("A");
	}
}
