package ecommerce.service;

import java.util.Iterator;

import ecommerce.model.cart.CartItem;
import ecommerce.model.payment.PaymentMethod;
import ecommerce.model.users.Customer;

public class CartService {
	private OrderService orderService = new OrderService();

	public void addItemToCart(Customer customer, CartItem item) {
		customer.getCart().getItems().add(item);
	}

	public void removeItemFromCart(Customer customer, CartItem item) {
		Iterator<CartItem> it = customer.getCart().getItems().iterator();
		while (it.hasNext()) {
			CartItem i = it.next();
			if (i.equals(item)) {
				it.remove();
			}
		}
	}

	public double calculateTotal(Customer customer) {
		double sum = 0;
		for (CartItem item : customer.getCart().getItems()) {
			sum += item.getQuantity() * item.getProduct().getPrice();
		}
		return sum;
	}

	public void checkout(Customer customer, PaymentMethod method) {
		orderService.createOrder(this, customer, method);
	}

}
