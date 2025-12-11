package ecommerce.model.orders;

import ecommerce.model.users.Customer;

public class Order {
	private String id;
	private Customer customer;
	private double totalPrice;
	private OrderStatus status;

	public Order(String id, Customer customer, double totalPrice, OrderStatus status) {
		this.id = id;
		this.customer = customer;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public String getId() {
		return this.id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public OrderStatus getStatus() {
		return this.status;
	}

}
