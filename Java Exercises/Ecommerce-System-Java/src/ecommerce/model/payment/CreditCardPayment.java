package ecommerce.model.payment;

public class CreditCardPayment implements PaymentMethod {
	private String cardNumber;
	private String expiryDate;
	private String cvv;

	public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public String getExpiryDate() {
		return this.expiryDate;
	}

	public String getCvv() {
		return this.cvv;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Payment successful");
	}

}
