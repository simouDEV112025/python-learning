package ecommerce.service;

import ecommerce.model.orders.Order;
import ecommerce.model.orders.OrderStatus;
import ecommerce.model.payment.CashOnDelivery;
import ecommerce.model.payment.PaymentMethod;
import ecommerce.model.users.Customer;
import ecommerce.repository.OrderRepository;

public class OrderService {
	private OrderRepository orderRepository = new OrderRepository();
	private int ord = 1;

	public void createOrder(CartService cartService, Customer customer, PaymentMethod method) {
		double total = cartService.calculateTotal(customer);
		String id = ("ord" + ord);
		OrderStatus status;
		method.pay(total);
		if (method instanceof CashOnDelivery) {
			status = OrderStatus.PENDING;
		} else {
			status = OrderStatus.PAID;
		}
		Order order = new Order(id, customer, total, status);
		orderRepository.addOrder(id, order);
		customer.getCart().clear();
		System.out.println("Order successful");
		ord++;
	}

	public void trackOrderStatus(String id) {
		if (orderRepository.getOrder(id) == null) {
			System.out.println("Order not found");
			return;
		}
		System.out.println("Order is: " + orderRepository.getOrder(id).getStatus());
	}

}
