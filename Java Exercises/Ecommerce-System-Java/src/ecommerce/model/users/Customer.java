package ecommerce.model.users;

import ecommerce.model.cart.Cart;
import ecommerce.model.cart.CartItem;

public class Customer extends User {
	private Cart cart;

	public Customer(String id, String username, String password, Cart cart) {
		super(id, username, password);
		this.cart = cart;
	}

	public Cart getCart() {
		return this.cart;
	}

	public void viewCart() {
		for (CartItem item : getCart().getItems()) {
			System.out.println(item.getProduct() + " " + item.getQuantity());
		}
	}

	@Override
	public String toString() {
		return getId() + " " + getUsername() + " " + getPassword();
	}

}
