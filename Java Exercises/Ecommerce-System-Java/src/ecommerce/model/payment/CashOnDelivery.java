package ecommerce.model.payment;

public class CashOnDelivery implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Payment pending — cash will be collected on delivery");
	}

}
