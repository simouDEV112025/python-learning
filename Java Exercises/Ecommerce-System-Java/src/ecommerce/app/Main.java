package ecommerce.app;

import ecommerce.model.cart.Cart;
import ecommerce.model.cart.CartItem;
import ecommerce.model.payment.CashOnDelivery;
import ecommerce.model.payment.CreditCardPayment;
import ecommerce.model.products.Book;
import ecommerce.model.products.Laptop;
import ecommerce.model.products.Phone;
import ecommerce.model.products.Product;
import ecommerce.model.products.ProductType;
import ecommerce.model.users.Admin;
import ecommerce.model.users.Customer;
import ecommerce.service.CartService;
import ecommerce.service.OrderService;
import ecommerce.service.ProductService;
import ecommerce.service.UserService;

public class Main {
	public static void main(String[] args) {
		// --- Users ---
		Admin admin = new Admin("a1", "adminUser", "pass123");
		Customer customer1 = new Customer("c1", "custUser1", "pass456", new Cart());
		Customer customer2 = new Customer("c2", "custUser2", "pass789", new Cart());

		// --- Services ---
		UserService userService = new UserService();
		ProductService productService = new ProductService();
		CartService cartService = new CartService();
		OrderService orderService = new OrderService();

		// --- Add users to repository ---
		userService.createUser(admin.getId(), admin);
		userService.createUser(customer1.getId(), customer1);
		userService.createUser(customer2.getId(), customer2);

		// --- Add products as admin ---
		Book book = new Book("b1", "Java Mastery", 29.99, 10, ProductType.BOOK, "John Doe", 300);
		Laptop laptop = new Laptop("l1", "UltraLaptop", 999.99, 5, ProductType.LAPTOP, 16, 512);
		Phone phone = new Phone("p1", "SuperPhone", 799.99, 8, ProductType.PHONE, 6.5, 4000);

		productService.addProduct(admin, book.getId(), book);
		productService.addProduct(admin, laptop.getId(), laptop);
		productService.addProduct(admin, phone.getId(), phone);

		// --- Customer1 adds products to cart ---
		cartService.addItemToCart(customer1, new CartItem(book, 2));
		cartService.addItemToCart(customer1, new CartItem(phone, 1));

		// --- Customer2 adds products to cart ---
		cartService.addItemToCart(customer2, new CartItem(laptop, 1));
		cartService.addItemToCart(customer2, new CartItem(phone, 2));

		// --- Customer1 checks out with Cash on Delivery ---
		orderService.createOrder(cartService, customer1, new CashOnDelivery());

		// --- Customer2 checks out with Credit Card ---
		CreditCardPayment cardPayment = new CreditCardPayment("1234567890123456", "12/27", "123");
		orderService.createOrder(cartService, customer2, cardPayment);

		// --- Track orders ---
		orderService.trackOrderStatus("ord1");
		orderService.trackOrderStatus("ord2");
		orderService.trackOrderStatus("ord3"); // nonexistent order test

		// --- Search products ---
		System.out.println("\nSearching products:");
		System.out.print("Search by name: ");
		Product p = productService.searchByName("UltraLaptop");
		if (p == null) {
			System.out.println("Product not found");
		} else {
			p.displaySpecs();
		}
		System.out.print("Search by type: ");
		Product p2 = productService.searchByType(ProductType.BOOK);
		if (p2 == null) {
			System.out.println("Product not found");
		} else {
			p2.displaySpecs();
		}
	}
}
