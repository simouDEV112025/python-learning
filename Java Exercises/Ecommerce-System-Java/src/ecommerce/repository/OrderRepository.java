package ecommerce.repository;

import java.util.Collection;

import ecommerce.model.orders.Order;

public class OrderRepository extends Repository<String, Order> {

	public void addOrder(String id, Order order) {
		save(id, order);
	}

	public void removeOrder(String id) {
		delete(id);
	}

	public Order getOrder(String id) {
		return find(id);
	}

	public Collection<Order> getAllOrders() {
		return findAll();
	}

	public void updateOrder(String id, Order newOrder) {
		update(id, newOrder);
	}

}
